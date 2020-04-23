package com.example.helloworlddemo;

public class ConsecutiveDucks {

    public static void main(String[] args) {
        //N is: 2 ≤ N ≤ (2^31) -1 .
        boolean b = consecutiveDucks(19);
        System.out.println("result boolean :" + b);
    }

    public static boolean consecutiveDucks(int n) {
        // your code here
        boolean flag = false;
        int i = 1;
        System.out.println("i:" + i);
        //如果i小于数字N
        int base = 1;
        for(int x=1;;x++){
           base+=x;
            System.out.println("base:"+base);
            if(base==n){
                return true;
            }
            if(base>n){
                break;
            }
        }

//        while (i < n) {
//            i += (i + 1);
//            System.out.println("add i:" + i);
//            if(i==n){
//                return true;
//            }
//
//
//        }


        return flag;
    }
}
