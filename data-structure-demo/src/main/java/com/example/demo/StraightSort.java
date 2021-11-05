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
 * 插入排序:
 * 悉数数组不规则
 * 拿到一个向前比
 * 如若依然比不停
 * 腾空挪移最前列
 * @Author: zhangQi
 * @Date: 2021-11-05 23:23
 */
public class StraightSort {

    public static void main(String[] args) {

        int[] arr = {3,4,6,11,2,70,20,10,4,6,36,3};

        int temp;
        int i;
        int j;
        for (i=1;i<arr.length;i++){
            temp=arr[i];

            for (j=i-1;j>=0&&arr[j]>temp;j--){
                System.out.println("j+1 bf:"+(j+1));
                arr[j+1]=arr[j];
            }
//            System.out.println("j+1 aft:"+(j+1));
            System.out.println("j aft:"+(j));
            arr[j+1]=temp;
        }

        Arrays.stream(arr).forEach(System.out::println);
    }


}
