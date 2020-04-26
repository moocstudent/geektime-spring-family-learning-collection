package com.example.annotationdemo;

import com.example.annotationdemo.annotation.Test;

import java.lang.reflect.Method;

public class FooTest {

    public static void main(String[] args) throws Exception {
        int passed = 0, failed = 0;
        String className = "com.example.annotationdemo.Foo";
        //使用反射获取方法
        for(Method m:Class.forName(className).getMethods()){
            if(m.isAnnotationPresent(Test.class)){
                try {
                    m.invoke(null);
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
