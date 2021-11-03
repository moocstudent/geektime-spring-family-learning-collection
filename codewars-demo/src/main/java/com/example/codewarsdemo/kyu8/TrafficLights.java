/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.codewarsdemo.kyu8;

/**
 * @Author: zhangQi
 * @Date: 2021-08-03 20:43
 * You're writing code to control your town's traffic lights.
 * You need a function to handle each change from green, to yellow, to red, and then to green again.
 *
 * Complete the function that takes a string as an argument representing the current
 * state of the light and returns a string representing the state the light should change to.
 *
 * For example, update_light('green') should return 'yellow'.
 *
 * Note: Use "" instead of '' in C++.
 */
public class TrafficLights {


    public static void main(String[] args) {
        String green = updateLight("green");
        System.out.println(green);
    }

    public static String updateLight(String current) {
        switch(current){
            case "green":return "yellow";
            case "yellow":return "red";
            case "red":return "green";
            default:return "";
        }
    }

}
