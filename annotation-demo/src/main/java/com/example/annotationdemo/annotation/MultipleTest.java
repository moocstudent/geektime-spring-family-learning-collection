package com.example.annotationdemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
//表示该注解会保留在class文件中
@Target(ElementType.METHOD)
//表示该注解只能用于方法

public @interface MultipleTest {
    int a() default 0;
    int b() default 0;
}
