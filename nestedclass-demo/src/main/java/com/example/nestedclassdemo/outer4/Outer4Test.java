package com.example.nestedclassdemo.outer4;

public class Outer4Test {

    public static void main(String[] args) {
        //第三方类访问静态嵌套类
        Outer4.Inner4 obj1 = new Outer4.Inner4();
        String innField1 = obj1.getInnField1();
        System.out.println("innField1:"+innField1);

        Outer4.Inner4 obj2 = new Outer4.Inner4();
        System.out.println(obj1==obj2);

        System.out.println("====================");
        Outer4 obj3 = new Outer4();
        Outer4.outFun2();
    }
}
