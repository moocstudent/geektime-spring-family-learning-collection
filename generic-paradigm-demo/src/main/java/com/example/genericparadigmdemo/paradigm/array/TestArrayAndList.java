/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm.array;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayAndList {

    public static void main(String[] args) {
        /**
         * compile error
         * 需要Abut 声明传入B
         */
        //B[] r1 = test(new ArrayList<B>());

        /**
         * 尽管接受类型是A[] but传入还是B的,编译异常
         */
        //A[] r2 = test(new ArrayList<B>());

        /**
         * 如果test接受的是Object,则以上包括这个就不会
         * 编译异常了
         */
        //Object[] r3 = test(new ArrayList<Object>());

        A[] r4 = test(new ArrayList<A>());

        Object[] r5 = test(new ArrayList<A>());

    }

    public static A[] test(ArrayList<A> list){
        return new A[1];
    }
}
