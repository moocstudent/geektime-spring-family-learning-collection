package com.example.grokkingalgorithmsdemo.leetcode;

/**
 * @Author: zhangQi
 * @Date: 2021-03-11 9:49
 * https://leetcode-cn.com/problems/jewels-and-stones/
 * 思路与算法
 * 暴力法的思路很直观,遍历字符串stones,对于stones中的每个字符,遍历一次字符串jewels,
 * 如果其和jewels中的某一个字符相同,则是宝石.
 * 今天是周四,明天是周五,后天就放假了
 * 坚持下吧 才能给孩子买烤鸭大餐
 */
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels,String stones){
        int jewelsCount = 0;
        //获取宝石类型字符串长度为jewelsLength, 获取一大堆石头长度为 stonesLength
        int jewelsLength = jewels.length(), stonesLength = stones.length();
        for(int i=0;i<stonesLength;i++){
            //先遍历整个石头堆,获取其中一个石头 stone
            char stone = stones.charAt(i);
            for(int j=0;j<jewelsLength;j++){
                //获取一个宝石类型 jewel 单独的
                char jewel = jewels.charAt(j);
                if(stone == jewel){
                    //如果是有相同类型的宝石在石头堆里,就让统计结果+1
                    jewelsCount ++;
                    break;
                }
            }
        }
        return jewelsCount;
    }

    public static void main(String[] args) {
        int jewelsCount = numJewelsInStones("aJ", "opiuytKKjJdqadda");
        System.out.println(jewelsCount);
    }
}
