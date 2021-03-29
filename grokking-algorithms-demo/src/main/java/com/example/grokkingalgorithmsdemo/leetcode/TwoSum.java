package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.*;

/**
 * @Author: zhangQi
 * @Date: 2021-03-05 14:54
 * https://leetcode-cn.com/problems/two-sum/
 */
public class TwoSum {

    public static int[] twoSum(int[] nums,int target){
        int[] ints = {};
        for(int i=0; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("i,j:"+i+","+j);
                    ints = new int[]{i, j};
                }
            }
        }
        return ints;
    }

    public static int[] twoSum1(int[] nums,int target){
        Queue<Integer> queue = new ArrayDeque<>();

        return null;
    }

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);
        soutArr(ints);

        int[] ints1 = twoSum(new int[]{3, 2, 4}, 6);
        soutArr(ints1);

        int[] ints2 = twoSum(new int[]{3, 3}, 6);
        soutArr(ints2);
    }

    private static void soutArr(int[] ints){
        Arrays.stream(ints).forEach(System.out::println);
    }
}
