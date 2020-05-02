package com.example.lambdademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Lambda表达式
 * 面向过程程序语言:参数传递是基本类型的变量
 * 面向对象语言
 * - 传递基本类型的变量
 * - 传递对象变量
 * 传递方法/代码块(函数式程序语言设计)
 * - 刚开始,Java为了简单性,一致性,拒绝此功能
 * - 为了市场和技术的需要,Java8开始,支持此项功能,提出Java的Lambda表达式实现
 *
 * - 类似于匿名方法,一个没有名字的方法
 * - 参数,箭头,表达式语句
 * - 可以忽略写参数类型
 * - 坚决不声明返回值类型
 * - 没有public/protected/private/static/final等修饰符
 * - 单句表达式,将直接返回值,不用大括号
 * - 带return语句,算多句,必须用大括号
 *
 * - 如果有返回值,返回值类型会在上下文推断出来的,无需声明
 * - 只在某几个分支有返回值,这样是不合法的
 *
 * 函数式接口
 * - 是一个接口,符合java接口的定义
 * - 只包含一个抽象方法的接口
 * - 可以包括其他的default方法,static方法,private方法
 * - 由于只有一个未实现的方法,所以Lambda表达式可以自动填上这个尚未实现的方法
 * - 采用Lambda表达式,可以自动创建出一个(伪)嵌套类的对象(没有实际的嵌套类class文件产生),
 * 然后使用,比真正嵌套类更加轻量,更加简洁高效
 *
 * - 只带有一个未实现的方法,内容简单
 * - 大量重复性的函数式接口,使得源码膨胀
 * 系统自带的函数式接口
 * - 涵盖大部分常用的功能,可以重复使用
 * - 位于java.util.function包中
 *
 * 系统自带的函数式接口(部分常用)
 * Predicate<T> 返回值Boolean
 * Consumer<T> 返回值void
 * Function<T,R> 返回值R
 * Supplier<T> 返回值T
 *
 *
 *
 *
 */
@SpringBootApplication
public class LambdaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LambdaDemoApplication.class, args);
    }

}
