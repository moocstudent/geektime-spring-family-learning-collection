package com.example.vertxwebdemo;

import com.example.vertxwebdemo.verticle.RestfulVerticle;
import io.vertx.core.Vertx;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 9:43
 * 运行后测试 curl -GET http://localhost:8080/get/1/2
 * 期待返回
 * {
 *   "method" : "get",
 *   "param1" : "1",
 *   "param2" : "2"
 * }
 * 浏览器访问 http://localhost:8080/assets/
 * 返回assets下默认index.html
 *
 *
 */
public class VerticleStart {

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new RestfulVerticle());
    }
}
