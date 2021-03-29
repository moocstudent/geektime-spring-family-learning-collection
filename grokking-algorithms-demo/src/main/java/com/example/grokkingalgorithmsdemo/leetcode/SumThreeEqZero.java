package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-03-04 11:00
 * https://leetcode-cn.com/problems/3sum/
 */
public class SumThreeEqZero {

    public static List<List<Integer>> threeSum(int[] nums) {
        //创建返回集合
        List<List<Integer>> resultList = new ArrayList();
        //获取数组长度
        int len = nums.length;
        //判定传入整数数组大小是否小于3或为null,这样不符合条件直接返回集合
        if(len<3 || nums==null){
            return resultList;
        }
        //必须排好序才能进行
        Arrays.sort(nums);
        //排好序后,开始循环数据操作,获取一个基数nums[i],一个左侧相加数L,一个右侧相加数R
        for(int i=0;i<len;i++){
            //如果当前数字大于0,则三数字之和一定大于0,所以结束循环
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1]) continue;
            //左侧设定为当前基数+1下标
            int L =i+1;
            //右侧设置为数组长度-1,最后一位
            int R = len-1;
            //防止重叠交错
            while(L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if(sum==0){
                    resultList.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    //此时相加的数据为0,因为结果集不要重复的三元组,此时要判定重复
                    //递增一个L,此时还不够,因为此时下标会停留在最后一个重复的L上,最终if里还有L++会递增
                    while(L<R && nums[L] == nums[L+1]) L++; //左侧去重
                    while(L<R && nums[R] == nums[R-1]) R--; //右侧去重
                    L++;
                    R--;
                }
                //当结果小于0时,肯定要提升L,因为排序好的数,左侧为小,右侧为大.
                else if(sum<0) L++;
                    //当结果大于0时,肯定要降低R,因为排序好的数,右侧为大,按序降低.
                else if(sum>0) R--;
            }
        }
        return resultList;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(lists);
    }
}
