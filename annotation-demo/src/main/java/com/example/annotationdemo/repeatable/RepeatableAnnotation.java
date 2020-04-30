package com.example.annotationdemo.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/**
 * 原始注解
 * 声明可以重复注解,并说明它的容器注解是哪个
 */
@Repeatable(RepeatableAnnotations.class)
public @interface RepeatableAnnotation {
    int a() default 0;
    int b() default 0;
    int c() default 0;
}
