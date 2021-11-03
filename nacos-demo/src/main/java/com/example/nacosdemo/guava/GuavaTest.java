/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.nacosdemo.guava;

import com.google.common.base.Splitter;
import org.springframework.stereotype.Component;



/**
 * @Author: Frank
 * @Date: 2021-06-22 17:53
 */
@Component
public class GuavaTest {

    public void cutString(String hi){

        Iterable<String> split = Splitter.on(",")
                .trimResults()
                .omitEmptyStrings()
                .split(hi);

        split.forEach(System.out::println);

    }

}
