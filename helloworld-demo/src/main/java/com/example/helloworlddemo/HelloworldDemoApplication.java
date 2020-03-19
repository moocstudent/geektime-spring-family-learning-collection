package com.example.helloworlddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 运行main spring启动
 * 测试hello接口
 * Terminal:
 * curl http://localhost:8080/hello
 * 返回hello Spring
 * curl http://localhost:8080/actuator/health
 * 返回spring健康状况
 */
@SpringBootApplication
@RestController
public class HelloworldDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloworldDemoApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello Spring";
    }
}
