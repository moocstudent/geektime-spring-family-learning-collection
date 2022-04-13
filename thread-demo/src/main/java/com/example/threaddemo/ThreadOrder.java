/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.threaddemo;

/**
 * @Author: Frank
 * @Date: 2022-02-17 19:07
 */
public class ThreadOrder {

    public static void main(String[] args) {
        Thread b = Thread.currentThread();
        b.setName("b");
        Thread a = new Thread(new MyThread());

        try {
            a.start();
            a.join();//a线程等待b线程终止
            b.start();
            b.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I am thread B");
    }

}


class MyThread implements Runnable{

    @Override
    public void run() {
        Thread.currentThread().setName("a");
        System.out.println("I am thread A");
    }
}