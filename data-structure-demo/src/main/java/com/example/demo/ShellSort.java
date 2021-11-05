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
 * 希尔排序
 * 一尺之长半尺开
 * 半尺开来比尺间
 * 半尺比完再折半
 * 终有序而尺不见
 * @Author: zhangQi
 * @Date: 2021-11-05 23:57
 */
public class ShellSort {

    public static void main(String[] args) {

        int[] arr = {3, 6, 88, 63, 1, 65, 32, 78, 39, 12, 64, 31, 4, 36, 1, 88, 3, 8, 40, 58};
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arr.length; i++) {
                System.out.println("gap bf:" + gap);
                int j = i;
                System.out.println("j bf:" + j);
                int count = 0;
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    swap(arr, j, j - gap);
                    count++;
                    j = j - gap;
                    System.out.println("j aft:" + j);
                    System.out.println("count:" + count);
                    System.out.println("gap:" + gap);
                }
            }

        }
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp;
        temp = arr[index2];
        arr[index2] = arr[index1];
        arr[index1] = temp;
    }


}
