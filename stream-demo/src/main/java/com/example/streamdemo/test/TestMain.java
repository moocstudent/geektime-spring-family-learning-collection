/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.streamdemo.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-05-26 14:51
 */
public class TestMain {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三", 18));
        list1.add(new Student("李四", 19));
        list1.add(new Student("王五", 20));
        list1.add(new Student("赵六", 21));
        list1.add(new Student("张三", 18));


        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("孙七", 18));
        list2.add(new Student("周八", 19));
        list2.add(new Student("吴九", 20));
        list2.add(new Student("赵六", 21));
        list2.add(new Student("张三", 18));

    }
}
