package com.example.genericparadigmdemo.paradigm.array;

import java.util.ArrayList;

/**
 * 其中B类继承于A类
 */
public class TestAB {
    public static void main(String[] args) {

        ArrayList<B> list1 = new ArrayList<>();
        list1.add(new B());

        /**
         * 编译error 需要A,but found B
         */
        //ArrayList<A> list2 = list1;

        /**
         * 协变,指定了上界
         */
        ArrayList<? extends A> list3 = new ArrayList<B>();

        /**
         * 逆变,指定了下界
         */
        ArrayList<? super B> list4 = new ArrayList<A>();
    }

}
