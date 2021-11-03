/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.codewarsdemo.kyu8;

/**
 * @Author: zhangQi
 * @Date: 2021-08-08 11:49
 * https://blog.csdn.net/zhangyong01245/article/details/83715717
 */
public class ReturnNagative {

    public static void main(String[] args) {
        int i = makeNegative(2);
        System.out.println(i);
    }

    public static int makeNegative(final int x) {
        return x<=0?x:x-x*2;
    }
}
