package com.example.annotationdemo;

import com.example.annotationdemo.annotation.Test;

public class Foo {

    @Test
    public static void m1(){}
    public static void m2(){}
    @Test
    public static void m3(){ throw new RuntimeException("boom");}
    public static void m4(){}
    @Test
    public static void m5(){}

}
