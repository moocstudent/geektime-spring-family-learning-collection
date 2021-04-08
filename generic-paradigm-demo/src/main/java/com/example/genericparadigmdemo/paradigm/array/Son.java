/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm.array;

public class Son extends Father {

    /**
     * 返回值可以是B也可以是C
     *
     * @param obj
     * @return
     */
    @Override
    public C f1(B obj) {
        System.out.println("Son.f1()");
        return new C();
    }

}
