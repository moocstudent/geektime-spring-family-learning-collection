/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.interviewdemo.methodtest;

/**
 * @Author: Frank
 * @Date: 2022-02-20 15:09
 */
public class Test {
    private static int j = 0;

    private static Boolean methodB(int k){
        j+=k;
        return true;
    }

    public static void methodA(int i){
        boolean b;
        b=i<10|methodB(4);
        b=i<10||methodB(8);
    }

    public static void main(String[] args) {
        methodA(0);
        System.out.println(j);
    }
}
