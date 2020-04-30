package com.example.annotationdemo.inherited;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/**
 * Inherited表示这个注解具有继承性
 */
@Inherited
public @interface InheritAnnotation {
}
