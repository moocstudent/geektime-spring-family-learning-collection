package com.example.annotationdemo.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * class文件会包括这个注解
 * JVM运行的时候会忽略掉部分注解
 */
@Retention(RetentionPolicy.CLASS)
public @interface ClassAnnotation {
}
