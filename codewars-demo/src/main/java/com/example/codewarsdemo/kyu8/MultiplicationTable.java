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
 * @Date: 2021-08-03 20:50
 *         Your goal is to return multiplication table for number that is always an integer from 1 to 10.
 *         <p>
 *         For example, a multiplication table (string) for number == 5 looks like below:
 *         <p>
 *         1 * 5 = 5
 *         2 * 5 = 10
 *         3 * 5 = 15
 *         4 * 5 = 20
 *         5 * 5 = 25
 *         6 * 5 = 30
 *         7 * 5 = 35
 *         8 * 5 = 40
 *         9 * 5 = 45
 *         10 * 5 = 50
 *         P. S. You can use \n in string to jump to the next line.
 *         <p>
 *         Note: newlines should be added between rows,
 *         but there should be no trailing newline at the end.
 *         If you're unsure about the format, look at the sample tests.
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        String s = multiTable(5);
        System.out.println(s);
    }

    public static String multiTable(int num) {
        String result = "";
        for (int i = 1; i <= 10; i++) {
            result += i + " * " + num + " = " + i * num + (i==10?"":"\n");
        }
        return result;
    }
}
