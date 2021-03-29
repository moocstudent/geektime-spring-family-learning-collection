package com.example.grokkingalgorithmsdemo.leetcode;


/**
 * @Author: zhangQi
 * @Date: 2021-03-08 17:25
 * https://leetcode-cn.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public static int reverse(int x){
        int res = 0;
        while(x!=0){
            //每次取末尾数字
            int tmp = x%10;
            //判断是否大于最大32位整数
            if(res>214748364 ||(res==214748364 && tmp > 7)){
                return 0;
            }
            //判断是否小于最小32位整数
            if(res<-214748364 || (res==-214748364 && tmp<-8)){
                return 0;
            }
            res = res*10 +tmp;
            x/=10;
        }
        return res;
    }

    public static int reverse1(int x){
        int absInt = Math.abs(x);
        boolean positive = false;
        if(x==absInt){
            positive = true;
        }
        String s = new StringBuilder(absInt+"").reverse().toString();

        Integer reverseInt = Integer.valueOf(s);
        if(!positive){
            x = -reverseInt;
        }else{
            x = reverseInt;
        }
        return x;
    }


    public static void main(String[] args) {
        int reverse = reverse(-123);
        System.out.println(reverse);
    }
}
