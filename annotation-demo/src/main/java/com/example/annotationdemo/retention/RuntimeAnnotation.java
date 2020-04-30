package com.example.annotationdemo.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * class包括这个注解
 * 并且JVM加载时也会把这部分注解加载进来
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RuntimeAnnotation {
}
