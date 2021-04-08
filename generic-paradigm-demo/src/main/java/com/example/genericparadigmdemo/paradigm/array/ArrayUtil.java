/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm.array;

public class ArrayUtil {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static void main(String[] args) {
        String middleStr = ArrayUtil.getMiddle("你好", "在家", "无故");
        System.out.println("middleStr:" + middleStr);

        Integer middleInte = ArrayUtil.getMiddle(1, 2, 3);
        System.out.println("middleInte:" + middleInte);

    }
}
