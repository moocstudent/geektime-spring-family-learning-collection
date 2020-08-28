package com.example.vertxtimerdemo;

import io.vertx.core.AbstractVerticle;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 11:20
 */
@Component
public class TimerVerticle extends AbstractVerticle {
    @Override
    public void start(){
        long timeInterval = 1500L;
        long timerId = vertx.setTimer(timeInterval,id->{
            System.out.println("该信息将于"+timeInterval+"毫秒后被打印.");
        });
    }
}
