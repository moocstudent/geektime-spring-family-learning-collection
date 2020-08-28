package com.example.eventbusdemo;

import io.vertx.core.Vertx;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 11:09
 */
public class EventBusStart {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new EventBusConsumersVerticle());
    }
}
