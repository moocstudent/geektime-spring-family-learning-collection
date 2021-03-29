package com.example.grokkingalgorithmsdemo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-03-09 14:51
 * https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveAllAdjacentDuplicatesInString {

    public static String removeDuplicates(String S){
        List<String> strings = new ArrayList<>(Arrays.asList(S.split("")));
        boolean remove = false;
        for(int i=0;i<strings.size()-1;i++){
            //让重复的先消失不见
            if(strings.get(i).equals(strings.get(i+1))){
                strings.remove(i);
                strings.remove(i);
                remove =true;
            }
        }
        if(remove){
            return removeDuplicates(strings.parallelStream()
                    .reduce((x,y)-> x+y)
                    .orElse(""));
        }else{
            return strings.parallelStream()
                    .reduce((x,y)->x+y)
                    .orElse("");
        }
    }

    public static void main(String[] args) {
        String singleton = removeDuplicates("abbaca");
        System.out.println(singleton);
    }
}
