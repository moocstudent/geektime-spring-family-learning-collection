package com.example.annotationdemo.rect.annos;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target({METHOD,TYPE})
@Retention(RetentionPolicy.SOURCE)
public @interface ToString {
    boolean includeName() default true;
}
