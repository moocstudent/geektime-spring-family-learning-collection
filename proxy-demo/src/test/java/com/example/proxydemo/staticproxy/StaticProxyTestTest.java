package com.example.proxydemo.staticproxy;

import com.example.proxydemo.subject.SubjectImpl;
import org.junit.jupiter.api.Test;

class StaticProxyTestTest {

    @Test
    void main() {
        //创建实际对象
        SubjectImpl subject = new SubjectImpl();
        //把实际对象封装到代理对象中
        StaticProxy p = new StaticProxy(subject);
        p.request();
    }
}