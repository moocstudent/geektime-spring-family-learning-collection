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
 * @Date: 2021-11-04 10:18
 */
public class FriedMeatThread extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(5000);
            System.out.println("炸肉 准备好了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
