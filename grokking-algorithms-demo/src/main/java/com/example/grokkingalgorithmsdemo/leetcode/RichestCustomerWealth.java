package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.Arrays;

/**
 * @Author: zhangQi
 * @Date: 2021-03-09 15:32
 * https://leetcode-cn.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        return Arrays.stream(Arrays.stream(accounts)
                .max((a, b) -> Arrays.stream(a).sum() - Arrays.stream(b).sum())
                .get())
                .sum();
    }

    public static void main(String[] args) {
        int[][] ints = new int[2][];
        ints[0] = new int[]{1,2,3};
        ints[1] = new int[]{3,2,1};
        int sum = maximumWealth(ints);
        System.out.println(sum);

        int[][] ints1 = new int[3][];
        ints1[0] = new int[]{1,5};
        ints1[1] = new int[]{7,3};
        ints1[2] = new int[]{3,5};
        int sum1 = maximumWealth(ints1);
        System.out.println(sum1);

    }
}
