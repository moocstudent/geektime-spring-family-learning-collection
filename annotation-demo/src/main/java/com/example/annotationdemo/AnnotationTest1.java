package com.example.annotationdemo;

import com.example.annotationdemo.annotation.SingleTest;
import com.example.annotationdemo.annotation.Test;

import java.util.Date;

public class AnnotationTest1 {

//    @SingleTest(value = 5)
    private int value1;

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    /**
     * 将所有警告压制忽略 该注解
     * @param args
     */
    @SuppressWarnings("all")
    public static void main(String[] args) {
        int a = 5;

        Date d = new Date();

        System.out.println(d.getYear());

        AnnotationTest1 annotationTest1 = new AnnotationTest1();
        System.out.println(annotationTest1.getValue1());//0

    }

    @Test
    public static void test(){
        System.out.println("test");
    }
}
