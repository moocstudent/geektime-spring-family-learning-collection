/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.nacosdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author: Frank
 * @Date: 2021-06-22 17:46
 */
@Aspect
@Component
public class MethodAspect {

//    @Pointcut("execution(public *  com.google.common.base.Splitter.split())")
    @Pointcut("execution(public * com.example.nacosdemo.controller.*.*(..))")
    public void log(){
        System.out.println("log invoke");
    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint)throws Exception{
        Object[] args = joinPoint.getArgs();
        System.out.println("args:"+args.toString());
        System.out.println("doBefore invoke");
    }

    @After("log()")
    public void doAfter() {
        System.out.println("after");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        System.out.println("after returning");
    }
}
