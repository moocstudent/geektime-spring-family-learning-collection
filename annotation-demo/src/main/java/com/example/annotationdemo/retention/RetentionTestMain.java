package com.example.annotationdemo.retention;

public class RetentionTestMain {

    public static void main(String[] args) throws Exception{
        //RetentionPolicy.SOURCE
        //注解不会保存到class文件
        //这种注解一般是提供给IDE环境做源码的质量分析和监控的
        Class a1 = Class.forName("com.example.annotationdemo.retention.A1");
        Class a2 = Class.forName("com.example.annotationdemo.retention.A2");
        System.out.println(a1.getAnnotations().length);
        System.out.println(a2.getAnnotations().length);
        System.out.println("==========================");
        //RetentionPolicy.CLASS
        //注解会保存到class文件中,但是不会被JVM加载
        Class b1 = Class.forName("com.example.annotationdemo.retention.B1");
        Class b2 = Class.forName("com.example.annotationdemo.retention.B2");
        System.out.println(b1.getAnnotations().length);
        System.out.println(b2.getAnnotations().length);
        System.out.println("==========================");
        //RetentionPolicy.RUNTIME
        //注解会保存在class文件中,且会被JVM加载,反射识别
        Class c1 = Class.forName("com.example.annotationdemo.retention.C1");
        Class c2 = Class.forName("com.example.annotationdemo.retention.C2");
        System.out.println(c1.getAnnotations().length);
        System.out.println(c2.getAnnotations().length);
        System.out.println("==========================");
    }
}
