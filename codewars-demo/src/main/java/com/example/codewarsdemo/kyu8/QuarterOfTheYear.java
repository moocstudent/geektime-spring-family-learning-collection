/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.codewarsdemo.kyu8;

/**
 * @Author: zhangQi
 * @Date: 2021-08-07 16:15
 * Given a month as an integer from 1 to 12,
 * return to which quarter of the year it belongs as an integer number.
 *
 * For example: month 2 (February), is part of the first quarter; month 6 (June),
 * is part of the second quarter; and month 11 (November), is part of the fourth quarter.
 */
public class QuarterOfTheYear {


    public static void main(String[] args) {
        int i = quarterOf(12);
        System.out.println(i);
        int i1 = quarterOf2(4);
        System.out.println(i1);
    }

    public static int quarterOf(int month) {
        // Your code here
        double quarterSize = month/6.0;
        double addSize= 0.5;
        if(quarterSize<=0.5){
            return 1;
        }else if(quarterSize >addSize && quarterSize<=addSize*2){
            return 2;
        }else if(quarterSize >addSize*2 && quarterSize<=addSize*3){
            return 3;
        }else if(quarterSize >addSize*3 && quarterSize<=addSize*4){
            return 4;
        }else{
            throw new RuntimeException("bug");
        }
    }
    public static int quarterOf2(int month){
        return (int) Math.ceil(month / 3.);
    }
}
