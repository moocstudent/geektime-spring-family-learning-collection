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
 * @Date: 2021-06-06 18:32
 */
public class AntiSingleton {
/**
 * 尽管单例是一个很常用的设计模式，在实际的开发中，我们也确实经常用到它，但是，有些人认为单例是一种反模式（anti-pattern），
 * 并不推荐使用。所以，今天，我就针对这个说法详细地讲讲这几个问题：单例这种设计模式存在哪些问题？为什么会被称为反模式？如果不用单例，
 * 该如何表示全局唯一类？有何替代的解决方案？话不多说，让我们带着这些问题，正式开始今天的学习吧！
 * 1
 */


    private static AntiSingleton instance = null;
    private final int paramA;
    private final int paramB;

    private AntiSingleton(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public static AntiSingleton getInstance() {
        if (instance == null) {
            throw new RuntimeException("Run init() first.");
        }
        return instance;
    }

    public synchronized static AntiSingleton init(int paramA, int paramB) {
        if (instance != null){
            throw new RuntimeException("AntiSingleton has been created!");
        }
        instance = new AntiSingleton(paramA, paramB);
        return instance;
    }

    @Override
    public String toString(){
        return "A:"+paramA+",B:"+paramB;
    }

    public static void main(String[] args) {
        AntiSingleton.init(10, 50);
        AntiSingleton instance = AntiSingleton.getInstance();
        System.out.println(AntiSingleton.instance); // 10 50
//        AntiSingleton.init(20, 30);
//        AntiSingleton instance2 = AntiSingleton.getInstance();
//        System.out.println(instance2); // exception
    }
}



