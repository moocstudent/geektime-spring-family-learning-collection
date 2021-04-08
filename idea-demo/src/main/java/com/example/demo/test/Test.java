package com.example.demo.test;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-03-29 15:07
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("你好世界你好世界你好世界你好世界你好世界你好世 say hello world !\n" +
                "界你好世界你好世界你好世界你好世界你好世界你好世界你好世界你 say hello world !\n" +
                "好世界你好世界你好世界你好世界你好世界你好世界你好世界你好世 say hello world !\n" +
                "界你好世界你好世界你好世界你好世界你好世界你好世界你好世界你好 say hello world !\n" +
                "世界你好世界你好世界 say hello world !\n");

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        int x = 0;
        int y = 1;
        int z = Math.max(y, x);
        System.out.println(z);
//        if (CollectionUtils.isEmpty(collection)) {
//
//        }

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);

        if (CollectionUtils.isEmpty(integers)) {
            System.out.println("数字集合为空");
        }

        if (!CollectionUtils.isEmpty(integers)) {
            integers.forEach(System.out::print);
        }

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);

        arr.forEach(System.out::println);



        if (CollectionUtils.isEmpty(arr)) {
            System.out.println("获取到了空集合");
        }

        if (!CollectionUtils.isEmpty(arr)) {
            System.out.println("集合c不为空");

        }

    }
}
