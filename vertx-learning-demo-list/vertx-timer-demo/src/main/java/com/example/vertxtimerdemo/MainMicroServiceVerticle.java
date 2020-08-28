//package com.example.vertxtimerdemo;
//
//import io.vertx.core.AbstractVerticle;
//import io.vertx.core.Context;
//import io.vertx.core.Vertx;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
///**
// * @Author: zhangQi
// * @Date: 2020-08-28 11:24
// */
//@Component
//public class MainMicroServiceVerticle extends AbstractVerticle {
//    @Autowired
//    private TimerVerticle timerVerticle;
//    @Autowired
//    private PeriodicVerticle periodicVerticle;
//
//    @Override
//    public void start(){
//        vertx.deployVerticle(timerVerticle);
//        vertx.deployVerticle(periodicVerticle);
//    }
//
//    @Override
//    public void init(Vertx vertx, Context context){
//        super.init(vertx,context);
//    }
//
//}
