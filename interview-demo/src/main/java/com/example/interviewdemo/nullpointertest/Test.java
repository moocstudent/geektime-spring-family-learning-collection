/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.interviewdemo.nullpointertest;

/**
 * @Author: Frank
 * @Date: 2022-02-20 15:12
 */
public class Test {

    public static void main(String[] args) {
        String s= null;

//        if((s!=null)&(s.length()>0)){
//            System.out.println("1");
//        }

        if((s!=null)&&(s.length()>0)){
            System.out.println("2");
        }

//        if ((s==null)&&(s.length()==0)){
//            System.out.println("3");
//        }

        if ((s==null)||(s.length()==0)){
            System.out.println("4");
        }
    }
}
