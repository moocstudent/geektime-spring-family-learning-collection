package com.example.annotationdemo.inherited;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
//Java 在运行时修改注解参数值
public @interface CommonAnnotation {
}
