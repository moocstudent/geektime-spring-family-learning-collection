/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.mathdemo.mathtest

/**
 * @Author: zhangQi
 * @Date: 2021-08-03 11:16
 */
class MathTest1 {

    public fun sum(mixed: List<Any>) = mixed.sumBy { it.toString().toInt() }
    public fun sum1(mixed: List<Any>) = mixed.sumBy { "$it".toInt() }

}