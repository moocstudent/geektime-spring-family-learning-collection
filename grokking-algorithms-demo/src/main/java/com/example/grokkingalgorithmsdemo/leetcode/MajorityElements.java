package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhangQi
 * @Date: 2021-03-04 11:20
 * https://leetcode-cn.com/problems/majority-element/
 */
public class MajorityElements {

    public static int majorityElement(int[] nums) {
        //设定长度
        int len = nums.length;

        //使用stream java8特性获取哪个数据为重复
        List<List<Integer>> resultNumsGroup = Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(el -> el))
                .values().parallelStream().collect(Collectors.toList());

        int majority = resultNumsGroup.parallelStream()
                .filter(ls -> ls.size() > len / 2)
                .findFirst()
                .get()
                .get(0)
                .intValue();

        return majority;
    }

    public static int majorityElement1(int[] nums) {
        //设定长度
        int len = nums.length;

        //使用stream java8特性获取哪个数据为重复
        return Arrays.stream(nums).boxed()
                .collect(Collectors.groupingBy(el -> el))
                .values().parallelStream().filter(ls -> ls.size() > len / 2)
                .findFirst()
                .get()
                .get(0)
                .intValue();
    }


    public static void main(String[] args) {
        int result = majorityElement1(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println(result);
    }
}
