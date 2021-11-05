/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.futuredemo.blunch;

import java.util.concurrent.Callable;

/**
 * @Author: zhangQi
 * @Date: 2021-11-04 10:24
 */
public class BlunchFutureThreadTest1 {

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        Callable<String> callable1 = new Callable<String>() {
            @Override
            public String call() throws Exception {
                new SeafoodNoddleSoupThread().start();
                return "ok";
            }
        };

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                new FriedMeatThread().start();
                return "meat ok";
            }
        };

        callable1.call();
        callable.call();

        long end = System.currentTimeMillis();
        System.out.println("blunch准备完毕:"+(end-start));
    }
}
