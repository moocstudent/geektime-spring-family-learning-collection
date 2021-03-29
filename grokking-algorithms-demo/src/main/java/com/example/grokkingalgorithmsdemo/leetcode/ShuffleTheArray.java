package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.Arrays;

/**
 * @Author: zhangQi
 * @Date: 2021-03-11 10:20
 * https://leetcode-cn.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {

    /**
     * 根据给定n从n处开始穿插排序数组
     * 输入：nums = [2,5,1,3,4,7], n = 3
     * 输出：[2,3,5,4,1,7]
     * 解释：由于 x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 ，所以答案为 [2,3,5,4,1,7]
     * nums.length == 2n
     *
     * @param nums
     * @param n
     * @return
     */
    public static int[] shuffle(int[] nums, int n) {
        int length = nums.length;

        //获取一半的数组长度,将原数组分成两个批次,每次获取这两个批次数组的其中第一个,从第一个批次的数组开始写入新结果
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                nums[i] = nums[i];
            } else {
                int temp = 0;
                if(i+1<length){
                    temp = nums[i];
                }
                nums[i] = nums[n];
                n++;
                if(i+1<length) {
                    nums[i + 1] = temp;
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] shuffle = shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3);
        Arrays.stream(shuffle).forEach(System.out::println);
    }
}
