package com.example.lambdademo.predicate;

import java.util.function.Predicate;

/**
 * 函数式接口Predicate 有断言的意思,返回boolean
 */
public class PredicateDemo {

    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"
        };
        Predicate<String> oddLength = s ->
                s.length() % 2 == 0;

        for (String p : planets) {
            if (oddLength.test(p)) {
                System.out.println("=====偶数=====" + p + "," + p.length());
            } else {
                System.out.println("=====奇数=====" + p + "," + p.length());
            }
        }
    }
}
