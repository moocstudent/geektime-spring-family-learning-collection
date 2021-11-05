/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.futuredemo.blunch;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author: zhangQi
 * @Date: 2021-11-04 10:30
 */
public class BlunchFutureThreadTest2 {


    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        Callable<String> seafoodsoupCall = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3000);
                return "海鲜汤粉面 准备好了";
            }
        };
        FutureTask<String> seafoodsoupCallTask = new FutureTask<>(seafoodsoupCall);
        new Thread(seafoodsoupCallTask).start();

        Callable<String> friedmeatCall = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "炸肉 准备好了";
            }
        };
        FutureTask<String> friedmeatCallTask = new FutureTask<>(friedmeatCall);
        new Thread(friedmeatCallTask).start();

        System.out.println(seafoodsoupCallTask.get());
        System.out.println(friedmeatCallTask.get());

        long end = System.currentTimeMillis();
        System.out.println("blunch准备完毕:"+(end-start));
    }
}
