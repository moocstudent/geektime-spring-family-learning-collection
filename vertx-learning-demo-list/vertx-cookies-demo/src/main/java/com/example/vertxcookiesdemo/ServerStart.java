package com.example.vertxcookiesdemo;

import io.vertx.core.Vertx;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 10:54
 * test:
 * visit localhost:8080 refresh
 */
public class ServerStart {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new CookieServer());
    }
}
