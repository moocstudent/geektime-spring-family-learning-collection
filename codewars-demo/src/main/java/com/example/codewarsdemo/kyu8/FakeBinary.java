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
 * @Date: 2021-08-03 18:20
 * Given a string of digits,
 * you should replace any digit
 * below 5 with '0' and any digit 5 and above with '1'.
 * Return the resulting string.
 */
public class FakeBinary {

    public static void main(String[] args) {
        String s = fakeBin("45385593107843568");
        System.out.println(s);
    }

    public static String fakeBin(String numberString) {
        String result = "";
        for (char aChar : numberString.toCharArray()) {
            String s = String.valueOf(aChar);
            Integer integer = new Integer(s);
            if (integer<5){
                result+="0";
            }else{
                result+="1";
            }
        }
        return result;
    }
}
