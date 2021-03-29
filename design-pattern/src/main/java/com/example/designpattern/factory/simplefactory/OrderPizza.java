package com.example.designpattern.factory.simplefactory;

import java.util.Scanner;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 9:44
 * test pizza factory from here
 */
public class OrderPizzaY {

    public OrderPizzaY(){
        System.out.println("披萨店🍕营业咯");
        System.out.println("现有品种: chess , greek , china , 输入exit将退出披萨店哦");
        Pizza pizza = null;
        String orderType;
        while(true){
            orderType = getType();
            switch (orderType){
                case "chess" : pizza=new ChessPizza(); pizza.setName("芝士披萨"); break;
                case "greek" : pizza=new GreekPizza(); pizza.setName("希腊披萨"); break;
                case "china" : pizza=new ChinaPizza(); pizza.setName("中国披萨"); break;
                case "exit" : System.out.println("退出披萨店咯");return;
                default:System.out.println("披萨类型输入有误");continue;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
            System.out.println(orderType+" already in your package ~!♥");
        }
    }

    public String getType(){
        Scanner str = new Scanner(System.in);
        System.out.println("please input the type of ordering pizza that you needed :");
        String type = str.next();
        return type;
    }

}
