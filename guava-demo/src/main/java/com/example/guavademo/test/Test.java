package com.example.guavademo.test;

import java.util.Objects;

/**
 * @Author: zhangQi
 * @Date: 2021-02-01 9:49
 */
public class Test {

    String value;

    String no;

    String description;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Test{" +
                "value='" + value + '\'' +
                ", no='" + no + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
