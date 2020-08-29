//package com.example.observerdemo;
//
//import com.example.observerdemo.model.Coffee;
//import com.example.observerdemo.model.CoffeeOrder;
//import com.example.observerdemo.service.CoffeeService;
//import com.example.observerdemo.service.OrderService;
//import io.reactivex.Single;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@SpringBootTest
//@Slf4j
//@EnableJpaRepositories
//class ObserverDemoApplicationTests {
//
//    @Test
//    void contextLoads() {
//    }
//
//
//
//    @Test
//    void coffeeSingleTest() {
//        coffeeService.testAddCoffee(new Coffee(1, "Latte"))
//                .flatMap(c -> {
//                    CoffeeOrder order = createOrder("ZhangQi", c);
//                    return orderService.create(order);
//                })
//                .doOnSuccess(s -> log.info("add coffee ok:{}", s))
//                .doOnError(t -> log.error("error", t))
//                .subscribe(o -> log.info("create coffeeOrder:{}", o))
//        ;
//        log.info("After subscribe");
//
////        coffeeSingle.
//    }
//
//    private CoffeeOrder createOrder(String customer, Coffee coffee) {
//        return CoffeeOrder.builder()
//                .customer(customer)
//                .item(coffee)
//                .build();
//    }
//}
