/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.designpatterndemo.singleton;


/**
 * @Author: Frank
 * @Date: 2021-06-06 18:43
 */
public class AntiSingleton1 {
    private static AntiSingleton1 instance = null;
    private final int paramA;
    private final int paramB;

    private AntiSingleton1(int paramA,int paramB){
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public synchronized static AntiSingleton1 getInstance(int paramA,int paramB){
        if(instance == null){
            instance = new AntiSingleton1(paramA, paramB);
        }
        return instance;
    }

    @Override
    public String toString(){
        return "A:"+paramA+",B:"+paramB;
    }

    public static void main(String[] args) {
        AntiSingleton1 instance = AntiSingleton1.getInstance(10, 50);
        System.out.println(instance); // 10 50
        AntiSingleton1 instance2 = AntiSingleton1.getInstance(20, 30);
        System.out.println(instance2); // 10 50
    }

}
