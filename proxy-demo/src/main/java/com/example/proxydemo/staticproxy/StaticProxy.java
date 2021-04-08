package com.example.proxydemo.staticproxy;

import com.example.proxydemo.subject.Subject;

/**
 * 静态代理对象
 * @author ukyoZq
 */
public class StaticProxy implements Subject {
    //实际目标对象
    private final Subject subject;

    public StaticProxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("PreProcess");
        subject.request();
        System.out.println("PostProcess");
    }

}
