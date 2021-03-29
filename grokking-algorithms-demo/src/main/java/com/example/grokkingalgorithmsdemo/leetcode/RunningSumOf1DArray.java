package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: zhangQi
 * @Date: 2021-03-09 15:18
 * https://leetcode-cn.com/problems/running-sum-of-1d-array/
 */
public class RunningSumOf1DArray {

    public static int[] runningSum(int[] nums){
        AtomicInteger incrementId = new AtomicInteger(1);
        Arrays.stream(nums)
                .reduce((n, m) -> {
                    int runningSum = n + m;
                    nums[incrementId.getAndIncrement()] = runningSum;
                    return runningSum;
                }).isPresent();
        return nums;
    }

//    public static int[] runningSum2(int[] nums){
//
//    }

    public static void main(String[] args) {
        int[] ints = runningSum(new int[]{1, 2, 3, 4});
        Arrays.stream(ints).forEach(System.out::println);
    }
}
