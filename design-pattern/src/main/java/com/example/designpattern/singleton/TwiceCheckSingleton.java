package com.example.designpattern.singleton;

/**
 * @Author: zhangQi
 * @Date: 2021-02-09 17:57
 * 双重检测锁
 */
public class TwiceCheckSingleton {

    private TwiceCheckSingleton(){}

    private static volatile TwiceCheckSingleton twiceCheckSingleton = null; //volatile防止指令重排

    public static synchronized TwiceCheckSingleton getTwiceCheckSingleton(){
        if (twiceCheckSingleton==null){
            synchronized (TwiceCheckSingleton.class){
                if(twiceCheckSingleton==null){
                    twiceCheckSingleton = new TwiceCheckSingleton();
                }
            }
        }
        return twiceCheckSingleton;
    }
}
