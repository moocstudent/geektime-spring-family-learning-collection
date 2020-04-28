package com.example.annotationdemo;

import com.example.annotationdemo.annotation.MultipleTest;

import java.lang.reflect.Method;

public class MultipleMain {
    public static void main(String[] args) throws Exception{
        int passed = 0, failed = 0;
        String className = "com.example.annotationdemo.MultipleDemo";
        for(Method m:Class.forName(className).getMethods()){
            if(m.isAnnotationPresent(MultipleTest.class)){
                System.out.println(m.getName());
                MultipleTest st = m.getAnnotation(MultipleTest.class);
                try {
                    m.invoke(null,st.a(),st.b());
                    passed++;
                } catch (Throwable e) {
                    System.out.printf("Test %s failed: %s %n",m,e.getCause());
                    failed++;
                }
            }
        }
        System.out.printf("Passed: %d, Failed %d%n",passed,failed);
    }
}
