package com.example.annotationdemo.target;

public class TargetTestMain {

    @FieldAnnotation
    @FieldMethodAnnotation
//    @MethodAnnotation
    private String name;

    @MethodAnnotation
    @FieldMethodAnnotation
    public static void main(String[] args) {
    }

    @MethodAnnotation
    @FieldMethodAnnotation
    public static void f1(){}
}
