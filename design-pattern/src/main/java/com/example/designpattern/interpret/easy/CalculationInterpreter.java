package com.example.designpattern.interpret.easy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @Author: zhangQi
 * @Date: 2021-02-10 10:12
 * 计算器简单版
 */
public class CalculationInterpreter {

    private Deque<Long> numbers = new LinkedList<>();

    public long interpret(String expression, String calType) {
        String[] elements = null;
        if (calType.equals(CalType.STANDARD.code)) {
            expression = StringUtils.trimAllWhitespace(expression);
            elements = expression.split("");
            Arrays.asList(elements).forEach(System.out::print);
            System.out.print("=");
        } else if (calType.equals(CalType.BEHIND.code)) {
            //如果表达式包含空格
            if (expression.indexOf(" ") > -1) {
                elements = expression.split(" ");
            } else {
                throw new RuntimeException("BIHIND 模式必须传入空格间隔数字和算数表达式");
            }
        }

        int length = elements.length;

        if (calType.equals(CalType.STANDARD.code)) {
            for (int i = 0; i < length; i += 2) {
                numbers.addLast(Long.parseLong(elements[i]));
            }
            for (int i = 1; i < length; i += 2) {
                String operator = elements[i];
                boolean isValid = "+".equals(operator) || "-".equals(operator)
                        || "*".equals(operator) || "/".equals(operator);
                if (!isValid) {
                    throw new RuntimeException("Expression is invalid ,please check the symbol and space : " + expression);
                }

                long number1 = numbers.pollFirst();
                long number2 = numbers.pollFirst();
                long result = 0;
                if (operator.equals("+")) {
                    result = number1 + number2;
                } else if (operator.equals("-")) {
                    result = number1 - number2;
                } else if (operator.equals("*")) {
                    result = number1 * number2;
                } else if (operator.equals("/")) {
                    result = number1 / number2;
                }
                numbers.addFirst(result);
            }
        } else if (calType.equals(CalType.BEHIND.code)) {
            for (int i = 0 / 2; i < (length+1)/2; ++i) {
                numbers.addLast(Long.parseLong(elements[i]));
            }
            for (int i = (length + 1) / 2; i < length; ++i) {
                String operator = elements[i];
                boolean isValid = "+".equals(operator) || "-".equals(operator)
                        || "*".equals(operator) || "/".equals(operator);
                if (!isValid) {
                    throw new RuntimeException("Expression is invalid ,please check the symbol and space : " + expression);
                }

                long number1 = numbers.pollFirst();
                long number2 = numbers.pollFirst();
                long result = 0;
                if (operator.equals("+")) {
                    result = number1 + number2;
                } else if (operator.equals("-")) {
                    result = number1 - number2;
                } else if (operator.equals("*")) {
                    result = number1 * number2;
                } else if (operator.equals("/")) {
                    if(number2==0){
                        System.out.print("除数不能为0,表达式:"+expression+" 默认返回Long最大值:");
                    }
                    try {
                        result = number1 / number2;
                    } catch (Exception e) {
//                        e.printStackTrace();
                        return Long.MAX_VALUE;
                    }
                }
                numbers.addFirst(result);
            }
        }

        if (numbers.size() != 1) {
            throw new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.pop();
    }

    public static void main(String[] args) {
        CalculationInterpreter cal = new CalculationInterpreter();

        String expression1 = "3+3";
        String expression2 = "3 + 3";
        String expression3 = "3 * 3";
        String expression4 = "3 - 3";
        String expression5 = "3 / 3 + 1";
        List<String> expressionList = new ArrayList<>();
        expressionList.add(expression1);
        expressionList.add(expression2);
        expressionList.add(expression3);
        expressionList.add(expression4);
        expressionList.add(expression5);
        expressionList.forEach(ex -> System.out.println(cal.interpret(ex,CalType.STANDARD.code)));

        System.out.println("-------------区分普通模式和后置模式------------");

        String behindExpression1 = "3 3 +";
        String behindExpression2 = "3 3 1 4 + - *";
        String behindExpression3 = "5 3 1 4 0 - - * /";
        String behindExpression4 = "2 3 1 4 0 9 * - * + +";
        List<String> behindExpressionList = new ArrayList<>();
        behindExpressionList.add(behindExpression1);
        behindExpressionList.add(behindExpression2);
        behindExpressionList.add(behindExpression3);
        behindExpressionList.add(behindExpression4);
        behindExpressionList.forEach(bhex-> System.out.println(cal.interpret(bhex,CalType.BEHIND.code)));
    }
}

@Getter
@AllArgsConstructor
enum CalType {

    STANDARD("standard","普通模式,如3+3"),
    BEHIND("behind","后置模式,如3 3 +");

    String code;
    String description;

}