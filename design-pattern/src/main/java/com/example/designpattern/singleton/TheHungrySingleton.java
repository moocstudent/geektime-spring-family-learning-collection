package com.example.designpattern.singleton;

/**
 * @Author: zhangQi
 * @Date: 2021-02-09 17:23
 */
public class TheHungrySingleton {
    //私有构造器,使其不能随便外层实例化
    private TheHungrySingleton(){
    }
    //new 对象 内部实例化
    private final static TheHungrySingleton theHungrySingleton = new TheHungrySingleton();

    public static TheHungrySingleton getTheHungrySingleton(){
        return theHungrySingleton;
    }
}
