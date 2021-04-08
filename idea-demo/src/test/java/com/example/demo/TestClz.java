package com.example.demo;

import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @Author: zhangqi
 * @Date: 2021-03-29 17:28
 */
public class TestClz {

    @Test
    @DisplayName("testNumberAdd")
    void testNumberAdd() {
        System.out.println("test");

    }

    @Test
    @DisplayName("test company list")
    void testCompanyList() {
        System.out.println(Lists.list(1,2,3,4));
    }

    @Test
    @DisplayName("Student list")
    void studentList() {
        System.out.println("测试学生列表");
    }

    @Test
    @DisplayName("Show Number Of Company")
    void showNumberOfCompany() {
        System.out.println("1");
    }

    @Test
    @DisplayName("Hello World")
    void helloWorld() {
        System.out.println("hello world");
    }
}
