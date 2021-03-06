package com.example.designpattern.factory.simplefactory;

import java.util.Scanner;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 9:44
 * test pizza factory from here
 */
public class OrderPizza {

    public OrderPizza(){
        System.out.println("æ«è¨åºðè¥ä¸å¯");
        System.out.println("ç°æåç§: chess , greek , china , è¾å¥exitå°éåºæ«è¨åºå¦");
        Pizza pizza = null;
        String orderType;
        while(true){
            orderType = getType();
            switch (orderType){
                case "chess" : pizza=new ChessPizza(); pizza.setName("èå£«æ«è¨"); break;
                case "greek" : pizza=new GreekPizza(); pizza.setName("å¸èæ«è¨"); break;
                case "china" : pizza=new ChinaPizza(); pizza.setName("ä¸­å½æ«è¨"); break;
                case "exit" : System.out.println("éåºæ«è¨åºå¯");return;
                default:System.out.println("æ«è¨ç±»åè¾å¥æè¯¯");continue;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            System.out.println(orderType+" already in your package ~!â¥");
        }
    }

    public String getType(){
        Scanner str = new Scanner(System.in);
        System.out.println("please input the type of ordering pizza that you needed :");
        String type = str.next();
        return type;
    }

}
