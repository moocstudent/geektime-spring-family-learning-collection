package com.example.annotationdemo.inherited;

public class InheritTestMain {

    public static void main(String[] args) throws Exception{
        Class a1 = Class.forName("com.example.annotationdemo.inherited.CommonFather");
        Class a2 = Class.forName("com.example.annotationdemo.inherited.CommonSon");
        System.out.println(a1.getAnnotations().length);
        System.out.println(a2.getAnnotations().length);

        System.out.println("==========================");

        Class a3 = Class.forName("com.example.annotationdemo.inherited.InheritFather");
        Class a4 = Class.forName("com.example.annotationdemo.inherited.InheritSon");
        System.out.println(a3.getAnnotations().length);
        System.out.println(a4.getAnnotations().length);

    }
}
