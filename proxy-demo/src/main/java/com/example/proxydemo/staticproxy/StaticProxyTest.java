package com.example.proxydemo.staticproxy;

import com.example.proxydemo.subject.SubjectImpl;

public class StaticProxyTest {

    public static void main(String[] args) {
        //创建实际对象
        SubjectImpl subject = new SubjectImpl();
        //把实际对象封装到代理对象中
        StaticProxy p = new StaticProxy(subject);
        p.request();

    }
}
