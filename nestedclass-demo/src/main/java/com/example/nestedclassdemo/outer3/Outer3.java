package com.example.nestedclassdemo.outer3;

/**
 * 普通内部类
 * - 编译后名称: 外部类名+$+内部类名
 * - 可以继承其他类,或者实现其他接口
 * - 可以用private/package private(不写)/protected/public控制外界访问
 * - 非静态的类,不能包含静态变量/方法,除了常量
 * - 和外部包围类的实例相关,一个普通内部类实例肯定是在一个外部包围类的实例中,
 * 且可以访问外部包围类的所有成员
 * - 在第三方类中,需要先创建外部包围类实例,才能创建普通内部类的实例,
 * 不允许单独的普通内部类对象存在!!!
 */
public class Outer3 {
    String name = "aaaaaa";

    public class Bird extends Animal implements Flyable{
        //常量OK
        public static final int a = 3;
        //不能定义非常量的static变量
        //public static int b = 4;

        @Override
        public void fly() {
            System.out.println(Outer3.this.name+" can fly");
        }
    }

    public Bird b1 = new Bird();

    public void f1(){
        b1.fly();
        System.out.println(b1.getClass().getName());
        this.name = "bbbbbb";
        b1.fly();
    }

    public Bird getBird(){
        return this.b1;
    }
}
