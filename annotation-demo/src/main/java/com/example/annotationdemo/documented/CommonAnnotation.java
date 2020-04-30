package com.example.annotationdemo.documented;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface CommonAnnotation {
    String value();
}
