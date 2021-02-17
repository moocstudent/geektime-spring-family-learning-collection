package com.example.designpattern.factory.simplefactory;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 9:36
 */
public class SimpleFactory {
}

abstract class Pizza{

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public void prepare(){
        System.out.println(name + " are prepared!");
    }

    public void bake(){
        System.out.println(name + " are baked!");
    }

    public void cut(){
        System.out.println(name + " are cutted!");
    }

    public void box(){
        System.out.println(name + " are boxed!");
    }

}

//芝士披萨
class ChessPizza extends Pizza{

}

//希腊披萨
class GreekPizza extends Pizza{

}

//中国披萨
class ChinaPizza extends Pizza{

}