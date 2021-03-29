package com.example.grokkingalgorithmsdemo.leetcode;

/**
 * @Author: zhangQi
 * @Date: 2021-03-10 18:13
 * https://leetcode-cn.com/problems/number-of-good-pairs/
 */
public class NumberOfGoodPairs {

    public static int numIdenticalPairs(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int num1 = numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3});
        System.out.println(num1);
        int num2 = numIdenticalPairs(new int[]{1, 1, 1, 1});
        System.out.println(num2);
        int num3 = numIdenticalPairs(new int[]{1, 2, 3});
        System.out.println(num3);
    }

}
