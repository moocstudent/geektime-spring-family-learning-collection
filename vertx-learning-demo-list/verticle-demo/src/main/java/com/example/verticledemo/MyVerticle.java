package com.example.verticledemo;

import io.vertx.core.AbstractVerticle;

/**
 * @Author: zhangQi
 * @Date: 2020-08-27 18:16
 */
public class MyVerticle extends AbstractVerticle {

    /**
     * verticle被部署后,都会执行的start
     * 需要在start()里加入一些需要做的工作
     */
    @Override
    public void start(){
        System.out.println("MyVerticle started!");
    }

    /**
     * 需要在stop()里加入一些需要清理的工作
     * 如统计运行时间
     */
    @Override
    public void stop(){
        System.out.println("MyVerticle stop!");
    }

}
