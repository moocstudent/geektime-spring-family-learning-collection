package com.example.vertxtimerdemo;

import io.vertx.core.AbstractVerticle;
import org.springframework.stereotype.Component;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 11:22
 */
@Component
public class PeriodicVerticle extends AbstractVerticle {
    @Override
    public void start() {
        long periodicInterval = 1200L;
        long periodicId = vertx.setPeriodic(periodicInterval, id -> {
            System.out.println("本条信息循环打印,时间间隔为:" + periodicInterval + "毫秒");
        });
    }
}
