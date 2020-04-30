package com.example.annotationdemo.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 只能修饰方法
 */
@Target(ElementType.METHOD)
public @interface MethodAnnotation {
}
