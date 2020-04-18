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
