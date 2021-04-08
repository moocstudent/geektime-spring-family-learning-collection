package src.dragon

/**
 * @Author: zhangQi
 * @Date: 2020-11-02 9:57
 * Kotlin中的类可以有一个主构造器,以及一个或者多个次构造器,
 * 主构造器是类头部的一部分,位于类名称之后
 */
class Person constructor(firstName:String)

/**
 * 如果主构造器没有任何注解,也没有任何可见度修饰符,那么constructor关键字可以省略
 */
class PersonTwo(firstName:String)