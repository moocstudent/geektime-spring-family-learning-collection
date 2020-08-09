package com.example.webfluxrestfuldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxRestfulDemoApplication {
    // 程序启动入口
    // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
    public static void main(String[] args) {
        SpringApplication.run(WebfluxRestfulDemoApplication.class, args);
    }

}
