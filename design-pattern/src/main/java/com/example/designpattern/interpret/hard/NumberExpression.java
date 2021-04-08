package com.example.designpattern.interpret.hard;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 11:26
 */
public class NumberExpression implements Expression{

    private final long number;

    public NumberExpression(long number){
        this.number = number;
    }

    public NumberExpression(String number){
        this.number = Long.parseLong(number);
    }

    @Override
    public long interpret() {
        return this.number;
    }

}
