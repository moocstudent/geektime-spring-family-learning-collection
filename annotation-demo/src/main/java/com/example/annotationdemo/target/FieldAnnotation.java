package com.example.annotationdemo.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 只能修饰成员变量
 */
@Target(ElementType.FIELD)
public @interface FieldAnnotation {
    int a() default 0;
}
