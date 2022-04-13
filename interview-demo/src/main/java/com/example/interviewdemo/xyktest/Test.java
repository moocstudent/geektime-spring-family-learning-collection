/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.interviewdemo.xyktest;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @Author: Frank
 * @Date: 2022-02-20 15:01
 */
public class Test {
    public static void main(String[] args) {
        int x= 0;
        int y= 0;
        int k= 0;
        for (int z=0;z<5;z++){
            if((++x>2)&&(++y>2)&&(k++>2)){
                x++;
                ++y;
                k++;
            }
        }
        System.out.println(x+""+y+""+k);
        InputStream inputStream;
        OutputStream outputStream;
    }
}
