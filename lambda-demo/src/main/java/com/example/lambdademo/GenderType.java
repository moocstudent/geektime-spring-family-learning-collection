package com.example.lambdademo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: zhangQi
 * @Date: 2021-01-27 16:31
 */

@Getter
@AllArgsConstructor
public enum GenderType {

    MALE("male"),
    FEMALE("female");

    private String code;

}
