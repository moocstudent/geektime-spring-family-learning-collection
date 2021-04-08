package com.example.nestedclassdemo;

/**
 * 匿名内部类
 * - 没有正式类名的内部类
 *  - 编译器产生内部名字: 类名+$+数字编号
 * - 没有类名,没有构造函数,能用父类/父接口的构造函数(可带参数)
 * - 可以继承,改写,补充父类/父接口的方法
 * - 内部不可以新定义静态成员(变量+方法),常量除外
 *  - final static int a = 5;
 * - 可以访问外部包围类的成员变量和方法(包括private)
 * - 如果定义在静态方法中,也只能访问外部包围类的静态成员
 * - 没有类名,外部包围类和其他类也无法访问到匿名内部类
 */
public class Outer1 {
    private final String name = "abc";

    public void f1(){
        String name = "def";

        Runnable r = new Runnable() {
            //匿名内部类不能定义静态变量,除非是常量
            public final static int a = 5;
            //public static int b = 3;
            final String name = "ghi";
            @Override
            public void run() {
                System.out.println("hello "+name);
            }
            //静态方法不能在匿名内部类定义
            //public static void f2(){}
        };
        new Thread(r).start();
        System.out.println(r.getClass().getName());

        //编译后会产生第二个class匿名内部类
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello "+Outer1.this.name);
            }
        };
        new Thread(r2).start();
        System.out.println(r2.getClass().getName());
    }
}
