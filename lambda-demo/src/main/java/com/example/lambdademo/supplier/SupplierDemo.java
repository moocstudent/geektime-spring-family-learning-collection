package com.example.lambdademo.supplier;

import java.util.function.Supplier;

import static java.lang.Math.floor;
import static java.lang.Math.random;

/**
 * 函数式接口Supplier(供应者),无输入参数,返回一个数据
 */
public class SupplierDemo {

    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"
        };
        Supplier<String> planetFactory = () ->
                planets[(int) floor(random() * 8)];

        for (int i = 0; i < 5; i++) {
            System.out.println(planetFactory.get());
        }
    }
}
