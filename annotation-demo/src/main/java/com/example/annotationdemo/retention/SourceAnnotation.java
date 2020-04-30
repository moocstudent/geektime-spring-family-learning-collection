package com.example.annotationdemo.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 只保留在源码级别上的注解
 */
@Retention(RetentionPolicy.SOURCE)
public @interface SourceAnnotation {
}
