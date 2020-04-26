package com.example.annotationdemo;

import com.example.annotationdemo.annotation.SingleTest;
import com.example.annotationdemo.annotation.Test;

import java.lang.reflect.Method;

public class BarTest {

    public static void main(String[] args) throws Exception{
        int passed = 0, failed = 0;
        String className = "com.example.annotationdemo.Bar";
        //使用反射获取方法
        for(Method m:Class.forName(className).getMethods()){
            if(m.isAnnotationPresent(SingleTest.class)){
                System.out.println(m.getName());
                SingleTest singleTest = m.getAnnotation(SingleTest.class);
                try {
                    m.invoke(null,singleTest.value());
                    passed++;
                } catch (Throwable e) {
                    System.out.printf("Test %s failed: %s %n",m,e.getCause());
                    failed++;
                }
            }
        }
        System.out.printf("Method passed:%d,failed:%d%n",passed,failed);
    }
}
