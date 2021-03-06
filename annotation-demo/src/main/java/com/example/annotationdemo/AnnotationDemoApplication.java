package com.example.annotationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 注解:Annotation
 * - 从JDK1.5引入
 * - 位于源码中(代码/注释/注解),使用其他工具进行处理的标签
 * - 注解用来修饰程序的元素,但不会对被修饰的对象有直接的影响
 * - 只有通过某种配套的工具才会对注解信息进行访问和处理
 * - 主要用途
 *  - 提供信息给编译器/IDE工具
 *  - 可用于其他工具来产生额外的代码/配置文件等
 *  - 有一些注解可在程序运行时访问,增加程序的动态性
 *
 * @Override 表示继承和覆写 自带注解
 * @Deprecated 表示废弃 自带注解
 * @SuppressWarnings 表示压制警告 自带注解
 * @SafeVarargs 不会对不定项参数做危险操作 自带注解
 * @FunctionInterface 声明功能性接口 自带注解
 *
 * JDK预定义的元注解(部分) 修饰注解的注解
 * @Target 设置目标范围 元注解 限定注解可以作用的位置
 * @Retention 设置保持性 元注解
 * @Documented 文档 元注解
 * @Inherited 注解继承 元注解
 * @Repeatable 此注解可以重复修饰 元注解
 *
 * 注解使用位置除了@Target限定位置
 * 其他允许的位置有
 * - 包
 * - 类
 * - 接口
 * - 方法
 * - 构造器
 * - 成员变量
 * - 局部变量/形参变量/类型参数
 *
 * @Retention 这个注解用来修饰其他注解的存在范围
 * RetentionPolicy.SOURCE 注解仅存在源码,不在class文件,也不会被JVM加载
 * 只有在源码级别进行注解处理
 * Java提供注解处理器来解析带注解的源码,产生新的文件
 *
 * RetentionPolicy.CLASS 这是默认的注解保留策略,注解存在于.class文件,但是不能被JVM加载
 * 只能采用字节码工具进行特殊处理 如ASM工具,https://asm.ow2.io/
 *
 *
 * RetentionPolicy.RUNTIME 这种策略下,注解可以被JVM运行时访问到.通常,可以结合反射来做一些事情
 *
 * @Target 限定目标注解作用于什么位置
 * ElementType.ANNOTATION_TYPE (修饰注解)
 * ElementType.CONSTRUCTOR
 * ElementType.FIELD
 * ElementType.LOCAL_VARIABLE
 * ElementType.METHOD
 * ElementType.PACKAGE
 * ElementType.PARAMETER
 * ElementType.TYPE (任何类型,即上面的类型都可以修饰)
 *
 * @Inherited 让一个类和它的子类都包含某个注解
 *
 * @Repeatable 从JDK1.8引入 表示被修饰的注解可以重复应用标注
 * 需要定义注解和容器注解
 *
 * @Documented 指明这个注解可以被Javadoc工具解析,形成帮助文档
 *
 * 反射解析注解:
 * Class.getAnnotations()
 * Class.isAnnotation()
 * Class.isAnnotationPresent(Class annotationClass)
 * Method.getAnnotations()
 * Method.isAnnotationPresent(Class annotationClass)
 * Field.getAnnotations()
 * Field.isAnnotationPresent(Class annotationClass)
 * Constructor.getAnnotations()
 * Constructor.isAnnotationPresent(Class annotationClass)
 *
 * RUNTIME注解的设计思路
 * 传统的接口中的变量,都是public final static
 * 注解需要随意赋值
 *  - 注解方法表示变量
 *  - 采用代理类拦截注解方法访问
 *  - 所有的注解的赋值,都放在Map中,访问速度快
 *
 *  注解已成为很多框架的标配
 *  需要了解注解的用法,更要理解它的原理
 *  不要滥用,特别是大团队使用多个框架/第三方库的兼容协调
 *  要注意第三方软件升级所带来的注解差异
 */
@SpringBootApplication
public class AnnotationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnnotationDemoApplication.class, args);
    }

}
