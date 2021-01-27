package com.example.lambdademo.demo1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LambdaDemo1 {

    public static void main(String[] args) {
        String[] planets = new String[]{
                "Mercury","Venus","Earth","Mars",
                "Jupiter","Saturn","Uranus","Neptune"
        };
        System.out.println("使用Lambda,长度从小到大");
        Arrays.sort(planets,(first,second)->(first.length()-second.length()));
        System.out.println(Arrays.toString(planets));
        System.out.println("不使用Lambda,是按照字母顺序排序");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("使用Lambda,长度从大到小");
        Arrays.sort(planets,(first,second)->(-1)*(first.length()-second.length()));
        System.out.println(Arrays.toString(planets));

        //使用真正lambda排序
//        Arrays.stream(planets)
//                .sorted(Comparator.comparing(String.class.hashCode()).reversed())
//                .collect(Collectors.toList());



    }
}
