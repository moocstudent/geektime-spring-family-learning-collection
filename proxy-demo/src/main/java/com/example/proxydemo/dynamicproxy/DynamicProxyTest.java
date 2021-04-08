package com.example.proxydemo.dynamicproxy;

import com.example.proxydemo.subject.Subject;
import com.example.proxydemo.subject.SubjectImpl;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

    public static void main(String[] args) {
        //1.创建目标对象
        SubjectImpl realSubject = new SubjectImpl();

        //2.创建调用处理器对象
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);

        //3.动态生成代理对象
        Subject proxySubject =
                (Subject) Proxy.newProxyInstance(
                SubjectImpl.class.getClassLoader(),
                SubjectImpl.class.getInterfaces(), proxyHandler
        );

        //4.客户端通过代理对象调用方法
        //本次调用将自动被代理处理器的invoke方法接收
        proxySubject.request();

//        proxySubject.response();

        System.out.println(proxySubject.getClass().getName());
    }
}
