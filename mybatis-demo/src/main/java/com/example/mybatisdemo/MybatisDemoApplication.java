package com.example.mybatisdemo;

import com.example.mybatisdemo.mapper.CoffeeMapper;
import com.example.mybatisdemo.model.Coffee;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Result;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

/**
 * 认识Mybatis
 * MyBatis
 * 一款优秀的持久层框架
 * 支持定制化SQL,存储过程和高级映射
 *
 * 在Spring中使用MyBatis
 * MyBatis Spring Adapter
 * MyBatis Spring-Boot-Starter
 *
 * @MapperScan 配置扫描位置
 * @Mapper 定义接口
 * 映射的定义 -- XML与注解
 *
 *
 */
@SpringBootApplication
@Slf4j
@MapperScan("com.example.mybatisdemo.mapper")
public class MybatisDemoApplication implements ApplicationRunner {
    @Resource
    private CoffeeMapper coffeeMapper;

    public static void main(String[] args) {
        SpringApplication.run(MybatisDemoApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Coffee c = Coffee.builder().name("espresso")
                .price(Money.of(CurrencyUnit.of("CNY"), 20.0)).build();
        int count = coffeeMapper.save(c);
        log.info("Save {} Coffee: {}", count, c);

        c = Coffee.builder().name("latte")
                .price(Money.of(CurrencyUnit.of("CNY"), 25.0)).build();
        count = coffeeMapper.save(c);
        log.info("Save {} Coffee: {}", count, c);

        c = coffeeMapper.findById(c.getId());
        log.info("Find Coffee: {}", c);
    }
}
