package com.example.lambdademo.function;

import java.util.function.Function;

/**
 * 函数式接口Function(函数),接收一个参数,返回一个参数
 */
public class FunctionDemo {

    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"
        };
        Function<String, String> upper = s -> s.toUpperCase();
            //可以做更复杂操作
//            return s.toUpperCase();
//        };
        for (String p : planets) {
            System.out.println(upper.apply(p));
        }

        Function<String, Integer> getLen = s -> s.length();
        for (String p : planets) {
            System.out.println(getLen.apply(p));
        }

    }
}
