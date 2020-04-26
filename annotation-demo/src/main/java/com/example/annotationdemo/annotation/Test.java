package com.example.annotationdemo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Target限定只能用在方法上 METHOD
 *  * - 包
 *  * - 类
 *  * - 接口
 *  * - 方法
 *  * - 构造器
 *  * - 成员变量
 *  * - 局部变量/形参变量/类型参数
 */
@Target(ElementType.METHOD)
/**
 * Retention表示该注解会保留在class文件中
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
}
