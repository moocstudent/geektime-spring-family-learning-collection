package com.example.verticledemo;

import io.vertx.core.Vertx;

/**
 * @Author: zhangQi
 * @Date: 2020-08-27 18:22
 */
public class VertStart {
    public static void main(String[] args) {
        /**
         * Vertx对象是Vert.x的控制中心,创建客户端和服务器,获取事件总线(event bus)的引用,
         * 设置定时器等功能都需要该实例
         * 该Vertx实例,其实并不能做具体事情,为了让程序能做一些有用的事情,需要将自定义的
         * MyVerticle实例注册到Vertx
         */
        Vertx vertx = Vertx.vertx();
        //verticle注册到Vertx方式一:通过传递一个Verticle实例参数
        vertx.deployVerticle(new MyVerticle());
        //verticle注册到Vertx方式二:通过包名称进行注册
        //vertx.deployVerticle("com.example.verticledemo.MyVerticle");

        //"MyVerticle started"被输出
    }
}
