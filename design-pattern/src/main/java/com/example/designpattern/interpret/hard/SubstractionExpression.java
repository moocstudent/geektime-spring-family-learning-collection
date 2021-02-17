package com.example.designpattern.interpret.hard;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 12:22
 */
public class SubstractionExpression implements Expression{
    private Expression exp1;
    private Expression exp2;

    public SubstractionExpression(Expression exp1, Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        return exp1.interpret()-exp2.interpret() ;
    }
}