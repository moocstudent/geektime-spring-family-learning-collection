package com.example.designpattern.singleton;

/**
 * @Author: zhangQi
 * @Date: 2021-02-09 17:55
 * 静态代码块
 */
public class HungrySingleton {
    private HungrySingleton(){
    }

    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    public static HungrySingleton getHungrySingleton(){
        return hungrySingleton;
    }
}
