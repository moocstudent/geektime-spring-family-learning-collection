package com.example.annotationdemo.documented;

public class DocumentTestMain {

    public static void main(String[] args) {
        new DocumentTestMain().f1();
        new DocumentTestMain().f2();
    }
    @CommonAnnotation(value="Hello CommonAnnotation")
    public void f1(){
        System.out.printf("1111111111111111");
    }
    @DocumentedAnnotation(value="Hello DocumentedAnnotation")
    public void f2(){
        System.out.printf("2222222222222222");
    }
}
