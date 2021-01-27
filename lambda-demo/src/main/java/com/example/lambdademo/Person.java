package com.example.lambdademo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: zhangQi
 * @Date: 2021-01-27 16:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private String name;

    private Integer age;

    private String gender;

}
