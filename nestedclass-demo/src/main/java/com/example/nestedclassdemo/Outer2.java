package com.example.nestedclassdemo;

import java.io.Serializable;

/**
 * 局部内部类: Local classes
 * - 编译后名称: 外部类名+$+序号+内部类名
 * - 可以继承其他类,或者实现其他接口
 * - 非静态的类,不能包含静态成员(变量和方法),除了常量
 * - 可以访问外部包围类的成员
 * - 如果定义在静态方法中,只能访问包围类的静态成员
 * - 局部内部类不能是一个接口,即接口不能定义在代码块中
 */
public class Outer2 {
    String name = "abc";

    //局部内部类
    public void f1(){
        String name = "def";

        class Inner2 extends Outer1 implements Runnable, Serializable {
            final static int a = 1;
            //不允许定义静态普通类成员
            //static int b = 2;
            String name = "ghi";

            public void f2(){
                System.out.println(name);
                System.out.println(Outer2.this.name);
            }

            @Override
            public void run() {
                System.out.println(name);
            }
        }

        Inner2 obj1 = new Inner2();
        obj1.f2();
        System.out.println(obj1.getClass().getName());
    }

    //局部内部类
    public static void f2(){
        final String name = "def";

        class Inner2{
            public String f2(){
                return "this is f2()";
            }
        }

        Inner2 inner2 = new Inner2();
        String s = inner2.f2();
        System.out.println(s);
        System.out.println(inner2.getClass().getName());
    }
}
