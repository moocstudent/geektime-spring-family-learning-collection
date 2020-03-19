package com.example.errorcodedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 自定义错误码(h2)
 * 详见Tests
 */
@SpringBootApplication
public class ErrorcodeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErrorcodeDemoApplication.class, args);
    }

}
