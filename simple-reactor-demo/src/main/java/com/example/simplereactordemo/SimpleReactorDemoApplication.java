package com.example.simplereactordemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

@SpringBootApplication
@Slf4j
public class SimpleReactorDemoApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(SimpleReactorDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Flux.range(1,6) //1-6的序列 = 1,2,3,4,5,6 注意顺序造成的区别
                .publishOn(Schedulers.elastic()) //不指定线程信息会在主线程Main上执行
                .doOnRequest(n->log.info("Request {} number",n))
                .doOnComplete(()->log.info("Publisher COMPLETE 1"))
                /**
                 * 如果执行该语句,之后的语句执行在elastic的线程池
                 * 可以在后续的代码上执行其它publishOn,操作其它线程池
                 */
                .map(i->{ //看这个i的值在哪个线程上发生的
                    log.info("Publish {}, {}",Thread.currentThread(),i);
//                    return 10 / (i-3);
                    return i;
                })
                .doOnComplete(()->log.info("Publisher COMPLETE 2"))
                .subscribeOn(Schedulers.single()) //单独的线程
//                .onErrorReturn(-1) //发生异常时拿默认值返回
                .onErrorResume(e->{ //有代码段儿的异常处理
                    log.error("Exception {}",e.toString());
                    return Mono.just(-1);
                })
                .subscribe(i->
                        log.info("Subscribe {}: {}",Thread.currentThread(),i),
                        e->log.error("error {}",e.toString()),
                        ()->log.info("Subscriber COMPLETE"),
                        s->s.request(4)
                );
                Thread.sleep(2000);
    }
}
