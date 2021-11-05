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
 * @Date: 2021-11-04 10:15
 */
public class SeafoodNoddleSoupThread extends Thread{

    @Override
    public void run(){
        try {
            Thread.sleep(3000);
            System.out.println("海鲜汤粉面 准备好了");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
