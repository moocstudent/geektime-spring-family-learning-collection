package com.example.genericparadigmdemo.paradigm.array;

public class ArrayUtil {
    public static <T> T getMiddle(T... a){
        return a[a.length/2];
    }

    public static void main(String[] args) {
        String middleStr = ArrayUtil.<String>getMiddle("你好", "在家", "无故");
        System.out.println("middleStr:"+middleStr);

        Integer middleInte = ArrayUtil.getMiddle(1, 2, 3);
        System.out.println("middleInte:"+middleInte);

    }
}
