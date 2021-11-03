/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.nacosdemo.guava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: Frank
 * @Date: 2021-06-22 18:02
 */
@Component
public class Test {

//    private static GuavaTest guavaTest;
//
//    @Autowired
//    public void setGuavaTest(GuavaTest guavaTest) {
//        Test.guavaTest = guavaTest;
//    }

    public static void main(String[] args) {
        GuavaTest guavaTest = new GuavaTest();
        guavaTest.cutString("hello,world");
    }
}
