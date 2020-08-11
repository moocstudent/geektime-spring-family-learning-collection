package com.example.binarytreedemo;

/**
 * @Author: zhangQi
 * @Date: 2020-08-11 17:14
 * @Description
 * 二叉树是数据结构中的重点也是难点
 * 二叉树是一种非线性结构,比数组,栈,队列等线性结构相比复杂度更高,想要做到心中有"树",
 * 需要自己动手画图,观察,思考,才能领会其真谛.
 * 结点是组成二叉树的最小单元
 */
public class BinaryTreeDemo {
    //用代码表示结点
    class Node<E>{
        E e;
        Node left,right;

        Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }
}
