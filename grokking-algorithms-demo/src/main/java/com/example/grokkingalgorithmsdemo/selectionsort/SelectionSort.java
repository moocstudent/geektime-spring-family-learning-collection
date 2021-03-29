package com.example.grokkingalgorithmsdemo.selectionsort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-03-03 15:25
 */
public class SelectionSort {

    //选择排序
    private static List<Integer> selectionSort(List<Integer> arr){
        //打算放入另一个新的列表中(新)
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for(int i=0;i<size;i++){
            //查找到最小的数据从当前数据中
            int smallestIndex = findSmallest(arr);
            //添加到要返回的新列表中,因为这是最小的一个,所以按顺序添加的话是没有问题的
            newArr.add(arr.get(smallestIndex));
            //将数据移除,这样再次循环查找最小元素就不会重复
            arr.remove(smallestIndex);
        }
        return newArr;
    }

    //很好理解的 找到列表中最小数的下标
    private static int findSmallest(List<Integer> arr){
        int smallest = arr.get(0);
        int smallestIndex = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<smallest){
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }


}
