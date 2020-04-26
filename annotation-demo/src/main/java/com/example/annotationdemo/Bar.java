package com.example.annotationdemo;

import com.example.annotationdemo.annotation.SingleTest;

public class Bar {

    @SingleTest(1)
    public static void m1(int a){
        if(a<0){
            throw new RuntimeException("Crash");
        }
    }

    public static void m2(){}

    @SingleTest(-2)
    public static void m3(int a){
        if(a<0){
            throw new RuntimeException("Crash");
        }
    }
}
