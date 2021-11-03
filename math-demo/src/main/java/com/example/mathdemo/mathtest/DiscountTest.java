/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.mathdemo.mathtest;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @Author: zhangQi
 * @Date: 2021-08-03 17:54
 */
public class DiscountTest {
    public static void main(String[] args) {

        BigDecimal discountValue = new BigDecimal(String.valueOf(100)).divide(new BigDecimal(String.valueOf(35)), 4,RoundingMode.HALF_UP);
        BigDecimal buyValue = new BigDecimal(String.valueOf(3000)).divide(new BigDecimal(String.valueOf(24)),4,RoundingMode.HALF_UP);
        int v = (discountValue.multiply(buyValue)).intValue();

        System.out.println(v);
    }
}
