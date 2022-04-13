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
 * 快速排序
 * 随机拿取临时数
 * 首位排序做交互
 * 临时数若不变位
 * 算法复杂度超大
 * @Author: zhangQi
 * @Date: 2021-11-07 10:47
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {49,38,65,96,23,22,85,86,1,5,7,2,0,-1,23};
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后:");
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            //寻找基准数据的正确索引
            int index = getIndex(arr,low,high);
            //进行迭代对index之前和之后的数组进行相同的操作使得整个数组变成有序

            //对下标0到下标tmp数据排好序位置-1处做一个排序
            quickSort(arr,low,index-1);
            //对下标tmp和数组最后一位下标处做一个排序
            quickSort(arr,index+1,high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        //基准数据
        int tmp = arr[low];
        while(low<high){
            //当队尾的元素大于等于基准数据时,向前挪动high指针
            while(low<high && arr[high] >= tmp){
                high--; //向前推进
            }
            //如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            //当队首元素小于等于tmp时,向前挪动low指针
            while(low<high && arr[low] <= tmp){
                low++; //前向推进
            }
            //当队首元素大于tmp时,需要将其赋值给high
            arr[high] = arr[low];
        }
        //跳出循环时flow和high相等,此时的low或high就是tmp的正确索引位置
        //由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = tmp;
        return low; //返回tmp的正确位置
    }
}
