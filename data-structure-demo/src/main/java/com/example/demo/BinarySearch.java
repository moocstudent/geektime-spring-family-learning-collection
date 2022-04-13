/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.demo;

import java.util.Arrays;

/**
 * 二分查找
 * 有序数组排列好
 * 每次对比中间值
 * 如还没有匹配到
 * 中间值往对半靠 
 * @Author: zhangQi
 * @Date: 2021-11-07 17:54
 */
public class BinarySearch {

    public static void main(String[] args) {
        int n = 3;
        int[] arr = {4,6,7,321,3,36,23,12,356,78,11,236,22,355,1};
        QuickSort.quickSort(arr,0,arr.length-1);
        System.out.println();
        Arrays.stream(arr).forEach(System.out::println);
        int index = binarySearch(arr,n);

        System.out.println();
        System.out.println(index);
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1; // 注意

        while(left <= right) { // 注意
            int mid = (right + left) / 2;
            if(nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1; // 注意
            } else if (nums[mid] > target) {
                right = mid - 1; // 注意
            }
        }
        return -1;
    }
}
