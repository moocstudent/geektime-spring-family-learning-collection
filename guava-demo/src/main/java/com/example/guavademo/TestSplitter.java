package com.example.guavademo;

import com.google.common.base.Splitter;

/**
 * @Author: zhangQi
 * @Date: 2021-02-01 9:31
 */
public class TestSplitter {

    public static void main(String[] args) {

        String[] a = {" foo"," ","bar"," quux"};
        String[] b = {"foo","bar","quux"};
        String[] c = {"foo","","bar","quux"};
        String[] d = {" foo"," ","bar"," quux",""};

        String splitRegex = ",|，";

//        Splitter.on()

        Iterable<String> split = Splitter.onPattern(splitRegex)
                .trimResults() //trim
                .omitEmptyStrings() //忽略空字符串
                .split(" foo, ,bar, quux,moon，cook,nice  ，lucky");
        System.out.println(split);
        //[foo, bar, quux]

    }
}
