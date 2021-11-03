/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.designpatterndemo.singleton;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author: Frank
 * @Date: 2021-06-06 19:10
 */
public class ThreadSingleton implements Runnable{
    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long,ThreadSingleton>
    instances = new ConcurrentHashMap<>();

    private static final ThreadLocal<ThreadSingleton> instances2 = new ThreadLocal();

    private ThreadSingleton(){}

    public static ThreadSingleton getInstance(){
        long currentThreadId = Thread.currentThread().getId();
        System.out.println("currentThreadId:"+currentThreadId);
        //缺席即添加 冒充就阻拦
        instances.putIfAbsent(currentThreadId,new ThreadSingleton());
        System.out.println("instances size:"+instances.size());
        return instances.get(currentThreadId);
    }
    public static ThreadSingleton getInstanceLocal(){
        instances2.set(new ThreadSingleton());
        return instances2.get();
    }

    public long getId(){
        return id.incrementAndGet();
    }


    @Override
    public void run() {
        System.out.println(getId());
    }

    public static void main(String[] args) {
        ThreadSingleton instance = getInstance();
        ThreadSingleton instance1 = getInstance();
        instance.run();
        instance.run();
        instance1.run();
        instance1.run();
        System.out.println("--------------------");
        ThreadSingleton instanceLocal = getInstanceLocal();
        ThreadSingleton instanceLocal2 = getInstanceLocal();
        instanceLocal.run();
        instanceLocal2.run();

    }
}
