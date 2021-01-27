package com.example.r2dbcdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * @Author: zhangQi
 * @Date: 2020-09-14 23:54
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    private Long id;

    private String name;
}
