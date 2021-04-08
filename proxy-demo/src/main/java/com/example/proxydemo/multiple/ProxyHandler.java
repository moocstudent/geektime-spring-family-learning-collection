package com.example.proxydemo.multiple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 代理类的调用处理器
 */
public class ProxyHandler implements InvocationHandler {

    private final Cook cook;

    public ProxyHandler(Cook cook){
        this.cook = cook;
    }

    //此函数在代理对象调用任何一个方法时都会被调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy类型:"+proxy.getClass().getName());
        System.out.println("调用方法:"+method+":参数为:"+Arrays.deepToString(args));
        Object result = method.invoke(getCook(), args);
        return result;
    }

    public Cook getCook() {
        return cook;
    }
}
