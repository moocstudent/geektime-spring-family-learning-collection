/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.futuredemo.blunch;

/**
 * @Author: zhangQi
 * @Date: 2021-11-04 10:19
 */
public class BlunchThreadTest1 {


    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        //先做海鲜汤面 3000 m seconds
        SeafoodNoddleSoupThread seafoodNoddleSoupThread = new SeafoodNoddleSoupThread();
        seafoodNoddleSoupThread.start();
        seafoodNoddleSoupThread.join();

        //再来点炸肉 5000 m seconds
        FriedMeatThread friedMeatThread = new FriedMeatThread();
        friedMeatThread.start();
        friedMeatThread.join();

        long end = System.currentTimeMillis();
        System.out.println("blunch准备完毕:"+(end-start));
    }
}
