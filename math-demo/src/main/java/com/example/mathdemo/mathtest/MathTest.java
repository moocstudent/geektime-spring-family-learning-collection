/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.mathdemo.mathtest;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Frank
 * @Date: 2021-06-10 15:55
 */
public class MathTest {

    public static void main(String[] args) {
//        long a = (long) Math.pow(2,10);
//        long b = (long) Math.pow(3,10);
//        System.out.println("a:"+a);
//        System.out.println("b:"+b);
//        System.out.println("a*b:"+a*b);
//        System.out.println("long max:"+Long.MAX_VALUE);
//
//        long ab = (long)Math.pow(6, 10);
//
//        System.out.println("ab:"+ab);
//
//        double l = ab / 5;
//        System.out.println("l:"+l);
//
//        BigDecimal lBD = BigDecimal.valueOf(ab);
//
//        BigDecimal divide = lBD.divide(BigDecimal.valueOf(5.0));
//        System.out.println("divide decimal:"+divide);

        System.out.println(sum(Arrays.asList(5,"5")));

    }

    public static int sum(List<?> mixed){
        return mixed.stream()
                .map(item -> new Integer(item.toString()))
                .reduce(Integer::sum)
                .get().intValue();
    }
}
