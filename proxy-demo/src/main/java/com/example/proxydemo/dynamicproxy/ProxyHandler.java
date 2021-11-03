package com.example.proxydemo.dynamicproxy;

import com.example.proxydemo.subject.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类的调用处理器
 * @author ukyoZq
 */
public class ProxyHandler implements InvocationHandler {

    private final Subject subject;

    public ProxyHandler(Subject subject){
        this.subject = subject;
    }

    /**
     * 此函数在代理对象调用任何一个方法时都会被调用
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println(proxy.getClass().getName());
        //定义预处理的工作,当然你也可以根据method的不同进行不同的预处理工作
        System.out.println("====before====");
        System.out.println("====after====");
        Object result = method.invoke(subject, args);
        System.out.println("result:"+result);
        return result;
    }
}
