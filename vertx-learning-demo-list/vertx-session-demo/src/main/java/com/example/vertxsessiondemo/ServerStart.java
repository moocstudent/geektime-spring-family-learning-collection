package com.example.vertxsessiondemo;

import io.vertx.core.Vertx;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 10:21
 * ceshi
 * visit localhost:8080
 * 多次访问查看计数
 */
public class ServerStart {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new SessionServer());
    }
}
