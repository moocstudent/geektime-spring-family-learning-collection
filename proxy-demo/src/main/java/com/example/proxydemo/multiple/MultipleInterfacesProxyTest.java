package com.example.proxydemo.multiple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * https://www.icourse163.org/learn/ECNU-1206500807?tid=1206823217
 * @author ukyoZq
 * @date 2020/4/18
 */
public class MultipleInterfacesProxyTest {

    public static void main(String[] args) throws Exception {
        Cook cook = new CookImpl();
        //创建指定类的类加载器
        ClassLoader c1 = MultipleInterfacesProxyTest.class.getClassLoader();
        ProxyHandler handler = new ProxyHandler(cook);

        //生成代理类型 这里的声明顺序是有关系的
        Class<?> proxyClass = Proxy.getProxyClass(c1, new Class<?>[]{Cook.class, Driver.class});

        //生成代理对象
        Object proxy = proxyClass.getConstructor(new Class[]{InvocationHandler.class})
                .newInstance(new Object[]{handler});
        System.out.println(Proxy.isProxyClass(proxyClass));

        Proxy p = (Proxy) proxy;
        System.out.println(Proxy.getInvocationHandler(proxy).getClass().getName());
        System.out.println("proxy类型:"+proxyClass.getName());

        //代理对象都继承于java.lang.reflect.Proxy,但是获取父类确实Object而不是Proxy
        Class father = proxyClass.getSuperclass();
        System.out.println("proxy的父类类型:"+father.getName());

        Class[] cs = proxy.getClass().getInterfaces();

        for(Class c:cs){
            System.out.println("proxy的父接口类型:"+c.getName());
        }
        System.out.println("============================");

        Method[] ms = proxy.getClass().getMethods();
        for (Method m:ms){
            System.out.println("调用方法"+m.getName()+":参数为"+ Arrays.deepToString(m.getParameters()));
        }
        System.out.println("=============================");

        Cook c = (Cook)proxy;
        c.doWork();

        Driver d = (Driver)proxy;
        d.doWork();
    }
}
