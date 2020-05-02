package com.example.nestedclassdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 嵌套类 Nested classes
 * - 静态嵌套类: Static nested classes,即类前面有static修饰符
 * - 非静态嵌套类: Non-static nested classes,又名内部类,Inner classes
 *  - 普通内部类(亦翻译为:成员内部类)
 *  - 局部内部类(Local classes)
 *  - 匿名内部类(Anonymous classes)
 *
 *  为什么需要嵌套类
 *  - 不同的访问权限要求,更细粒度的访问控制
 *  - 简洁,避免过多的类定义
 *  - 语言设计过于复杂,较难学习和使用
 *
 *  匿名内部类:Anonymous classes
 *  - 没有类名的内部类,必须继承一个父类/实现一个父接口
 *  - 在实例化以后,迅速转型为父类/父接口
 *  - 这种类型的对象,只能new一个对象,之后以对象名字操作
 *  - 可在普通语句和成员变量赋值时使用内部类
 *
 *  局部内部类:Local classes
 *  - 定义在代码块中的非静态的类,如方法,for循环,if语句等
 *  - 定义后,即可创建对象使用
 *  - 只能活在这个代码块中,代码块结束后,外界无法使用该类
 *
 *  了解匿名内部类和局部内部类
 *  - 两者几乎相似
 *  - 局部内部类可以重用,匿名内部类不能重用
 *  - 匿名内部类更简洁
 *
 *  普通内部类
 *  - 非static的类,定义在某个类的成员变量位置
 *  - 定义后,在类里面均可以使用
 *
 *  静态嵌套类
 *  - 层级和包围类(enclosing class)的成员变量/方法一样
 *  - 第三方需要通过外部包围类才可以访问到静态嵌套类
 *
 *  了解普通内部类和静态嵌套类
 *  - 两者都定义在外围类中的成员级别
 *  - 静态嵌套类不依赖于外围类对象,但是只能访问外围类的静态成员
 *  - 普通内部类必须依赖于外围类对象,不能单独存在,但是可以访问外围类的所有成员
 *
 *  四种类对比(1)
 *  Oracle官方文档比较
 *  - 匿名内部类:应用它,如果需要定义额外的变量和方法
 *  - 局部内部类:在一个方法内,需要创建一个新的类型,并重复使用
 *  - 普通内部类:和局部内部类相似,在一个类中定义,可重复使用,可以访问外部类成员,但不需要访问外部类方法的形参和内部变量
 *  - 静态嵌套类:在一个类中定义,可重复使用,并需要访问外部类的静态成员
 *
 *  外部访问规则
 *  外部访问和修饰符关系
 *  - 普通内部类和静态嵌套类可以被外部访问
 *  - 外部访问普通内部类和静态嵌套类,和普通类之间访问规则一样
 *
 *  变量遮蔽 Shadowing
 *  - 嵌套类变量和外部包围类的变量重名
 *   - 以离得近作为优先原则
 *   - 优先级高的变量会遮蔽优先级低的变量
 *   - 外部包围类.this.变量名,可以访问到外部包围类的成员变量
 *   - 静态嵌套类不能访问非静态变量
 *   - Java7及以前,匿名内部类和局部内部类只能访问外部包围类的final成员变量
 *   - Java8及以后,匿名内部类和局部内部类可访问外部包围类的final成员变量和事实意义上的final变量
 *
 *   
 *
 *
 *
 *
 *
 *
 */
@SpringBootApplication
public class NestedclassDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(NestedclassDemoApplication.class, args);
    }

}
