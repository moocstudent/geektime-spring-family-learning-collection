package com.example.vertxtimerdemo;

import io.vertx.core.Vertx;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 12:19
 * 定期,延时执行
 * 在标准verticle里,你不能以使线程休眠的方式引入延迟,这样会阻塞event loop线程
 * 取而代之的是Vert.x定时器 定时器分为一次性(one-shot)和周期性(periodic)
 * verticle内部创建的定时器,在verticle被卸载时,这些定时器将被自动关闭
 * 定时器会定期触发,如果你的定期处理需要耗费大量时间,你的定时器事件可能会连续运行甚至糟糕到堆积在一起
 * 这种情况下,应该使用setTimer(TimerVerticle)一旦处理完成了,可以再设置下一个定时器
 */
public class TimerStart {
    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new TimerVerticle());
        vertx.deployVerticle(new PeriodicVerticle());
    }
}
