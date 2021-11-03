package com.example.proxydemo.dynamicproxyprocess;

import com.example.proxydemo.subject.Process;
import com.example.proxydemo.subject.Subject;
import com.example.proxydemo.subject.SubjectImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Proxy;

@Component
public class DynamicProxyTest {
//
//    private static SubjectImpl subjectImpl;
//
//    @Autowired
//    public void setSubjectImpl(SubjectImpl subjectImpl){
//        DynamicProxyTest.subjectImpl = subjectImpl;
//    }
//
//    private static NodeHandler proxyHandler;
//
//    @Autowired
//    public void setProxyHandler(NodeHandler nodeHandler) {
//        DynamicProxyTest.proxyHandler = nodeHandler;
//    }

    public static void main(String[] args) {
        //1.创建目标对象
        SubjectImpl realSubject = new SubjectImpl();
//
        //2.创建调用处理器对象
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);

        proxyHandler.setNodeCode("apply");

//        //3.动态生成代理对象
        Subject proxySubject =
                (Subject) Proxy.newProxyInstance(
                        realSubject.getClass().getClassLoader(),
                        realSubject.getClass().getInterfaces(), proxyHandler
                );


        //4.客户端通过代理对象调用方法
        //本次调用将自动被代理处理器的invoke方法接收
//        proxySubject.request();


        proxySubject.submit(new Process());

//        proxySubject.response();

//        System.out.println(proxySubject.getClass().getName());
    }
}
