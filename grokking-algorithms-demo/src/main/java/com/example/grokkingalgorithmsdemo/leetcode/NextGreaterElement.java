package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: zhangQi
 * @Date: 2021-03-07 12:59
 * https://leetcode-cn.com/problems/next-greater-element-ii/
 */
public class NextGreaterElement {

    public static int[] nextGreaterElements(int[] nums){
        int n = nums.length;
        int[] ret = new int[n];
        Arrays.fill(ret,-1);
        //ret被填充了-1
        Arrays.stream(ret).forEach(System.out::println);
        Deque<Integer> stack = new LinkedList<Integer>();
        //循环长度增至数组长度*2-1
        for(int i=0;i<n*2-1;i++){
            while(!stack.isEmpty() && nums[stack.peek()] <nums[i%n]){
                ret[stack.pop()] = nums[i%n];
            }
            stack.push(i%n);
        }
        return ret;
    }

    public static int[] nextGreaterElements1(int[] nums) {
        //一个循环的数,即使上一个循环的数被更改,也是可以按序找到下一个更大的数
        int[] intsNew = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            boolean change = false;
            for (int j = i+1; j < nums.length + i; j++) {
                if (j >= nums.length) {
                    if (nums[j - nums.length] > nums[i]) {
                        if (!change) {
                            intsNew[i]= nums[j - nums.length];
                            intsNew[nums.length-1] = nums[j-nums.length];
                        }
                    } else {
                        intsNew[i]=-1;
                        intsNew[nums.length-1] = -1;
                    }
                } else {
                    if (nums[j] > nums[i]) {
                        intsNew[i]= nums[j];
                    }
                }
            }
        }
        return intsNew;
    }

    public static int[] nextGreaterElementsBowen(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);
        int target = 0;
        for(int i=0; i<n;i++){
            target = nums[i];
            for(int j=i+1;j<n+i+1;j++){
                if(nums[j%n] > target){
                    ans[i] = nums[j%n];
                    break;
                }
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] ints = nextGreaterElements(new int[]{1, 2, 1});
        int[] intsBowen = nextGreaterElementsBowen(new int[]{1, 2, 1});
        Arrays.stream(intsBowen).forEach(System.out::println);
        System.out.println();
//        Arrays.stream(ints).forEach(System.out::println);
    }
}
