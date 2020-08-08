package com.example.reactordemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class ReactorDemoApplicationTests {

    @Test
    void contextLoads() {
    }

    /**
     * 创建Flux或Mono,调用subscribe()后,数据开始流动
     * 主要方法有: just,fromArray,fromStream,fromIterable,range
     */
    @Test
    public void create(){
        //just方法
        String[] arr = new String[]{"hello","world"};
        Flux<String> flux1 = Flux.just(arr);
        flux1.subscribe(System.out::println);

        Mono<String> mono = Mono.just("hi world");
        mono.subscribe(System.out::println);

        //fromArray
        List<String> list = Arrays.asList("welcome", "single one");
        Flux<String> flux2 = Flux.fromIterable(list);
        flux2.subscribe(System.out::println);

        //fromIterable方法
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Orange");
        Flux<String> flux3 = Flux.fromIterable(fruitList);
        flux3.subscribe(System.out::println);

        //fromStream方法
        Stream<String> stream = Stream.of("hi","hello");
        Flux<String> flux4 = Flux.fromStream(stream);

        //range方法
        Flux<Integer> range = Flux.range(0,5);

        //interval方法,take方法限制个数为5个
        Flux<Long> longFlux = Flux.interval(Duration.ofSeconds(1)).take(5);
        longFlux.subscribe(System.out::println);
    }

}
