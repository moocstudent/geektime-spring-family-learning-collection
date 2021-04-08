package com.example.binarytreedemo;


import java.util.ArrayList;

/**
 * @Author: zhangQi
 * @Date: 2020-08-11 17:31
 * @De
 * 完全二叉树的创建与遍历
 */
public class BinaryTree {
    //结点
    private Node root;
    //结点数
    private final int size;
    //存放结点
    private final ArrayList<Node> list;

    public BinaryTree(){
        this.root = null;
        this.size = 0;
        this.list = new ArrayList<>();
    }

    public void createTree(Object[] array){
        for (int i=0;i<array.length;i++){
            Node node = new Node(array[i]);
            list.add(node);
            if(this.root==null){
                this.root = node;
            }
        }
        if(list.size()>0){
            //分布到两处结点上 属于一个父结点 ?
            for(int i=0;i<array.length/2;i++){
                if(2*i+1<list.size()){
                    list.get(i).left=list.get(2*i+1);
                }
                if(2*i+2<list.size()){
                    list.get(i).right=list.get(2*i+2);
                }
            }
        }
    }

    //前序遍历
    public void preOrder(Node root){
        if(root==null){
            return;
        }else{
            System.out.print(root.getData()+" ");
        }
        preOrder(root.left);
        preOrder(root.right);
    }

    public Node getRoot(){
        return root;
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Character[] array = {'A','B','C','D','E','F','G','H','I','J','K','L',
                'M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        binaryTree.createTree(array);
        binaryTree.preOrder(binaryTree.getRoot());
    }
}
