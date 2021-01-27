package com.example.lambdademo.consumer;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * 函数式接口Consumer,一次性操作,无返回
 */
public class ConsumerDemo {

    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"
        };
        Consumer<String> printer = s ->
                System.out.println("Planet : " + s);

//        for (String p : planets) {
//            printer.accept(p);
//        }
        Arrays.asList(planets)
                .forEach(plt->printer.accept(plt));
    }
}
