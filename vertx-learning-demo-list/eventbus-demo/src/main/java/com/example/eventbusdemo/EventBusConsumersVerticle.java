package com.example.eventbusdemo;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.eventbus.MessageConsumer;

/**
 * @Author: zhangQi
 * @Date: 2020-08-28 11:00
 */
public class EventBusConsumersVerticle extends AbstractVerticle {

    @Override
    public void start(){
        EventBus();
    }

    public void EventBus(){
        //get eb instance
        EventBus eb = vertx.eventBus();
        //one consumer of topic pattern be created
        MessageConsumer<String> consumer = eb.consumer("news.uk.sport");
        consumer.handler(message->{
            System.out.println("1-I have received a message of sport : "+message.body());
            message.reply("1-how interesting!");
        });

        //second consumer of topic pattern be created
        MessageConsumer<String> consumer1 = eb.consumer("news.uk.finance");
        consumer1.handler(message->{
            System.out.println("2-I have received a message of finance : "+message.body());
            message.reply("2-how intellect!");
        });

        /*consumer sport received*/
        consumer.completionHandler(res->{
            if(res.succeeded()){
                System.out.println("1-The handler registration has reached all nodes");
            }else{
                System.out.println("Registration failed!");
            }
        });
        /*consumer finance received*/
        consumer1.completionHandler(res->{
            if(res.succeeded()){
                System.out.println("2-The handler registration has reached all nodes");
            }else{
                System.out.println("Registration failed!");
            }
        });

        EventBus football_game_started = eb.publish("news.uk.sport", "football game started");

        eb.publish("news.uk.finance","UK brexit");

        //not working
        eb.publish("news.uk.*","english land common news");
    }
}
