package com.example.annotationdemo.target;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

/**
 * 可以修饰成员变量以及方法
 */
@Target({FIELD,METHOD})
public @interface FieldMethodAnnotation {
}
