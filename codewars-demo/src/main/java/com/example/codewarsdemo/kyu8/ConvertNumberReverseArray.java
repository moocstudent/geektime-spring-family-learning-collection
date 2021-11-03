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
 * @Date: 2021-08-03 21:09
 *         Convert number to reversed array of digits
 *         Given a random non-negative number, you have to return the digits of
 *         this number within an array in reverse order.
 *         <p>
 *         Example:
 *         348597 => [7,9,5,8,4,3]
 */
public class ConvertNumberReverseArray {

    public static void main(String[] args) {
        int[] digitize = digitize(348597);
        for (int i : digitize) {
            System.out.println(i);
        }
    }

    public static int[] digitize(long n) {
        // Code here
        String nstr = String.valueOf(n);
        char[] chars = nstr.toCharArray();
        int length = nstr.length();
        int[] ints = new int[length];
        int minusIndex = 1;
        for (char aChar : chars) {
            ints[length - minusIndex] = Integer.valueOf(String.valueOf(aChar));
            minusIndex++;
        }
        return ints;
    }
}
