package com.example.designpattern.interpret.hard;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 12:23
 */
public class DivisionExpression implements Expression{
    private final Expression exp1;
    private final Expression exp2;

    public DivisionExpression(Expression exp1,Expression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public long interpret() {
        try {
            return exp1.interpret()/exp2.interpret();
        } catch (ArithmeticException e) {
            if(exp2.interpret()==0){
                System.out.print("除数不能为0,默认返回Long最大值:");
            }
            return Long.MAX_VALUE;
        }
    }
}
