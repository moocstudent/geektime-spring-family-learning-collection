package com.example.designpattern.interpret.hard;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 12:26
 */
public class ExpressionInterpreter {
    private final Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression){
        String[] elements = expression.split(" ");
        int length = elements.length;
        for(int i=0;i<(length+1)/2;++i){
            numbers.addLast(new NumberExpression(elements[i]));
        }
        for(int i=(length+1)/2;i<length;++i){
            String operator = elements[i];
            boolean isValid = "+".equals(operator) || "-".equals(operator)
                    || "*".equals(operator) || "/".equals(operator);
            if(!isValid){
                throw new RuntimeException("Expression is invalid: "+expression);
            }

            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            Expression combindExp = null;
            if("+".equals(operator)){
                combindExp = new AdditionExpression(exp1,exp2);
            }else if("-".equals(operator)){
                combindExp = new SubstractionExpression(exp1,exp2);
            }else if("*".equals(operator)){
                combindExp = new MultiplicationExpression(exp1,exp2);
            }else if("/".equals(operator)){
                combindExp = new DivisionExpression(exp1,exp2);
            }
            long result = combindExp.interpret();
            numbers.addFirst(new NumberExpression(result));
        }

        if(numbers.size()!=1){
            throw new RuntimeException("Expression is invalid: "+expression);
        }

        return numbers.pop().interpret();
    }

    public static void main(String[] args) {
        ExpressionInterpreter cal = new ExpressionInterpreter();
        String behindExpression1 = "3 3 +";
        String behindExpression2 = "3 3 1 4 + - *";
        String behindExpression3 = "5 3 1 4 0 - - * /";
        String behindExpression4 = "2 3 1 4 0 9 * - * + +";
        List<String> behindExpressionList = new ArrayList<>();
        behindExpressionList.add(behindExpression1);
        behindExpressionList.add(behindExpression2);
        behindExpressionList.add(behindExpression3);
        behindExpressionList.add(behindExpression4);
        behindExpressionList.forEach(bhex-> System.out.println(cal.interpret(bhex)));
    }
}
