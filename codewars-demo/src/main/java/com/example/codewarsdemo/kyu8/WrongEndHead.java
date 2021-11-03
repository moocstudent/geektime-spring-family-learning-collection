/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.codewarsdemo.kyu8;

import java.util.stream.Stream;

/**
 * @Author: zhangQi
 * @Date: 2021-08-07 16:41
 * You're at the zoo... all the meerkats look weird.
 * Something has gone terribly wrong - someone has gone and switched their heads and tails around!
 *
 * Save the animals by switching them back.
 * You will be given an array which will have three values (tail, body, head). It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).
 *
 * Same goes for all the other arrays/lists that you will get in the tests:
 * you have to change the element positions with the same exact logics
 */
public class WrongEndHead {

    public static void main(String[] args) {
        String[] strings = fixTheMeerkat(new String[]{"ground", "rainbow", "sky"});
        Stream.of(strings).forEach(System.out::println);
    }

    public static String[] fixTheMeerkat(String[] arr) {
        String tempHead = arr[2];
        arr[2] = arr[0];
        arr[0] = tempHead;
        return arr;
    }
}
