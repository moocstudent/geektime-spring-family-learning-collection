/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.interviewdemo.stufftest;

/**
 * @Author: Frank
 * @Date: 2022-02-20 14:59
 */
public class StaticStuff {

    static int x = 10;
    static {x+=5;}

    public static void main(String[] args) {
        System.out.println("x="+StaticStuff.x);
    }

    static {x/=3;}
}
