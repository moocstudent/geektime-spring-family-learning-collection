package com.example.aopdemo;


import com.example.aopdemo.XmlReader;
import com.example.aopdemo.impl.PersonImpl;
import com.sun.prism.ResourceFactoryListener;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

public class TestAop {

    public static void initXml() {
        XmlReader.readXml("C:\\Users\\Administrator\\IdeaProjects\\geektime-spring-family-learning\\aop-demo\\src\\main\\resources\\aops.xml");
        ResourceListener.addListener("C:\\Users\\Administrator\\IdeaProjects\\geektime-spring-family-learning\\aop-demo\\src\\main\\resources");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        TestAop.initXml();

        Person action = new PersonImpl();
        ProxyHandler mh = new ProxyHandler(action);
        ClassLoader c1 = TestAop.class.getClassLoader();
        Class<?> proxyClass = Proxy.getProxyClass(c1, Person.class);
        Person proxy = (Person) proxyClass.getConstructor(new Class[]{InvocationHandler.class}).newInstance(new Object[]{mh});


        while(true){
            proxy.eat();
            try{
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
