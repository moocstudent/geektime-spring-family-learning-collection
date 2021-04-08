package com.example.helloworlddemo;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

/**
 * @Author: zhangQi
 * @Date: 2020-08-27 17:31
 */
public class Server  {
    //启动
    public static void main(String[] args) {
        new Server().start();
    }

    public void start() {
        //创建Vertx工具集核心接口
        Vertx vertx = Vertx.vertx();
        //创建路由器
        Router router = Router.router(vertx);
        //设定路由内容返回
        router.route().handler(routingContext -> {
            routingContext.response().putHeader("content-type", "text/html").end("hello world!");
        });
        //创建HttpServer,请求路由,监听8080
        vertx.createHttpServer().requestHandler(router).listen(8080);
    }
}
