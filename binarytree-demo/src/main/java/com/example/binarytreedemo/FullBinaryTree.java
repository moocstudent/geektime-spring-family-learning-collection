package com.example.binarytreedemo;

import java.util.Arrays;

/**
 * @Author: zhangQi
 * @Date: 2020-08-11 17:22
 * @Description
 * 完全二叉树的线性存储
 */
public class FullBinaryTree {
    private final Object[] arr;
    private int size;
    //gouzaoqi Construct initialize the parameters
    FullBinaryTree(int capacity){
        this.arr = new Object[capacity+1];
        this.size = 0;
    }

    public int getSize(){
        return this.size;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }

    public void add(Object e,int index){
        assert index <= this.arr.length;
        this.arr[index] = e;
        this.size ++;
    }

    @Override
    public String toString(){
        return "FullBinaryTree{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        FullBinaryTree fullBinaryTree = new FullBinaryTree(26);
        //存入26个字母 从下标1开始
        for (Character c = 'A';c<='Z';c++){
            fullBinaryTree.add(c,c-'A'+1);
        }

        System.out.println(fullBinaryTree.toString());
    }
}
