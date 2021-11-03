/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.codewarsdemo.kyu8;

import java.util.Arrays;

/**
 * @Author: zhangQi
 * @Date: 2021-08-03 18:13
 * For every good kata idea there seem to be quite a few bad ones!
 *
 * In this kata you need to check the provided array (x)
 * for good ideas 'good' and bad ideas 'bad'. If there are
 * one or two good ideas, return 'Publish!', if there are
 * more than 2 return 'I smell a series!'.
 * If there are no good ideas, as is often the case, return 'Fail!'.
 */
public class WellOfIdeas {

    public static void main(String[] args) {
        String[] strings = {"good", "bad", "bad", "bad", "bad"};

        String well = well(strings);
        System.out.println(well);
    }

    public static String well(String[] x) {
        long good = Arrays.stream(x)
                .filter(i -> i.equals("good"))
                .count();
        String result = "";
        if (good>0 && good<3){
            result =  "Publish!";
        }else if(good>2){
            result =  "I smell a series!";
        }else if(good==0){
            result = "Fail!";
        }
        return result;
    }

}
