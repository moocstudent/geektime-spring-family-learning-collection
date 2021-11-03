/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.designpatterndemo.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: Frank
 * @Date: 2021-06-05 20:52
 * SingletonHolder 是一个静态内部类，当外部类 IdGenerator 被加载的时候，
 * 并不会创建 SingletonHolder 实例对象。只有当调用 getInstance() 方法时，
 * SingletonHolder 才会被加载，这个时候才会创建 instance。
 * instance 的唯一性、创建过程的线程安全性，都由 JVM 来保证。
 * 所以，这种实现方法既保证了线程安全，又能做到延迟加载。
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private IdGenerator(){}

    private static class SingletonHolder{
        private static final IdGenerator instance = new IdGenerator();
    }

    public static IdGenerator getInstance(){
        return SingletonHolder.instance;
    }

    public long getId(){
        return id.incrementAndGet();
    }

}
