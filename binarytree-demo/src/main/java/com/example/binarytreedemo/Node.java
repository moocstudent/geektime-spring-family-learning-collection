package com.example.binarytreedemo;

/**
 * @Author: zhangQi
 * @Date: 2020-08-11 17:31
 * @De
 * 单节点
 */
public class Node{
    Object data;
    Node left, right;

    Node(Object data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Object getData() {
        return data;
    }
}
