package com.example.observerdemo;

import com.example.observerdemo.model.Coffee;
import com.example.observerdemo.model.CoffeeOrder;
import com.example.observerdemo.service.CoffeeService;
import com.example.observerdemo.service.OrderService;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * rx2-vertx的demo在vertx-example中
 */
@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class ObserverDemoApplication implements ApplicationRunner {


    public static void main(String[] args) {
        SpringApplication.run(ObserverDemoApplication.class, args);
    }

    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    private OrderService orderService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        coffeeSingleTest();
    }

    /**
     * 创建一个coffee
     * 之后将该coffee id创建到订单中
     */
   Single<Coffee> coffeeSingleTest() {
//       System.out.println("coffeeSingleTest");
       Single<Coffee> latte = coffeeService.testAddCoffee(new Coffee(1, "Latte"));
       System.out.println(latte);
       Single<Long> coffeeOrder = orderService.create(createOrder("ZhangQi", 1L));
       System.out.println(coffeeOrder);
       return latte;

//                   latte
//                           .doOnSuccess(s -> log.info("add coffee ok code:{}", s))
//                           .doOnError(t -> log.error("error", t))
//                           .flatMap(c -> {
//                               CoffeeOrder order = createOrder("ZhangQi", c);
//                               return orderService.create(order);
//                           })
//                           .doOnSuccess(s -> log.info("add coffeeOrder ok code:{}", s))
//                           .doOnError(t -> log.error("error", t))
//                           .subscribe(o -> log.info("create coffeeOrder:{}", o));

//       );
    }


    private CoffeeOrder createOrder(String customer, long coffee) {
        return CoffeeOrder.builder()
                .customer(customer)
                .item(coffee)
                .build();
    }

}
