package com.example.springbucksdemo;

import com.example.springbucksdemo.model.Coffee;
import com.example.springbucksdemo.model.CoffeeOrder;
import com.example.springbucksdemo.model.OrderState;
import com.example.springbucksdemo.repository.CoffeeOrderRepository;
import com.example.springbucksdemo.repository.CoffeeRepository;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * lesson 18
 * Repository
 * @EnableJpaRepositories (帮我自动发现CurdRepository等这样的接口的扩展)
 *
 * 定义查询
 * 根据方法名定义查询
 * find...By... / read...By... / query...By / get...By...
 * count...By...
 * ...OrderBy... [Asc / Desc]
 * And / Or / IgnoreCase
 * Top / First / Distinct
 *
 * 分页查询
 * PagingAndSortingRepository<T,ID>
 *   Pageable/Sort
 *   Slice<T>/Page<T>
 *
 *
 */
@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class SpringBucksDemoApplication implements ApplicationRunner {

    @Autowired
    private CoffeeRepository coffeeRepository;
    @Autowired
    private CoffeeOrderRepository orderRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBucksDemoApplication.class, args);
    }

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        initOrders();
        findOrders();
    }

    private void initOrders(){
        Coffee latte = Coffee.builder().name("latte")
                .price(Money.of(CurrencyUnit.of("CNY"), 30.0)).build();
        Coffee save = coffeeRepository.save(latte);
        if(save!=null){
            System.out.println("Coffee:"+latte);
        }else{
            System.out.println("Coffee not saved");
        }

        Coffee espresso = Coffee.builder()
                .name("espresso")
                .price(Money.of(CurrencyUnit.of("CNY"), 20.0))
                .build();
        Coffee save1 = coffeeRepository.save(espresso);
        if(save1!=null){
            System.out.println("Coffee:"+espresso);
        }else{
            System.out.println("Coffee not saved");
        }

        CoffeeOrder order = CoffeeOrder.builder()
                .customer("ZhangQi")
                .items(Collections.singletonList(espresso))
                .state(OrderState.INIT)
                .build();
        CoffeeOrder orderSave = orderRepository.save(order);
        System.out.println("Order:"+order);

        order = CoffeeOrder.builder()
                .customer("JunJun")
                .items(Arrays.asList(espresso, latte))
                .state(OrderState.INIT)
                .build();
        orderRepository.save(order);
        System.out.println("Order1:"+order);
    }

    private void findOrders(){
        coffeeRepository
                .findAll(Sort.by(Sort.Direction.DESC, "id"))
                .forEach(c-> System.out.println("Loading"+c));
        List<CoffeeOrder> list = orderRepository.findTop3ByOrderByUpdateTimeDescIdAsc();
        System.out.println("findTop3ByOrder..."+getJoinedOrderId(list));

        list = orderRepository.findByCustomerOrderById("ZhangQi");
        System.out.println("findByCustomerOrder.ZQ.."+getJoinedOrderId(list));
        list = orderRepository.findByCustomerOrderById("JunJun");
        System.out.println("findByCustomerOrder.JunJun.."+getJoinedOrderId(list));

        list.forEach(o->{
            System.out.println("Order:"+o.getId());
            o.getItems().forEach(i-> System.out.println("Item:"+i));
        });

        list = orderRepository.findByItems_Name("latte");
        System.out.println("findByItems.Name:"+getJoinedOrderId(list));
    }

    /**
     * 转换list获取id加入join形成1,2,3
     * @param list
     * @return
     */
    private String getJoinedOrderId(List<CoffeeOrder> list){
        return list.stream().map(o->o.getId().toString())
                .collect(Collectors.joining(","));
    }
}
