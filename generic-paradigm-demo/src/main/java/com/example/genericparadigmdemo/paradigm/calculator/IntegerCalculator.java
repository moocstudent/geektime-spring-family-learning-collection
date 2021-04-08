/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm.calculator;

import org.springframework.stereotype.Component;

@Component
public class IntegerCalculator implements Calculator<Integer> {
    @Override
    public Integer add(Integer operand1, Integer operand2) {
        return operand1 + operand2;
    }

    @Override
    public Integer addMany(Integer... operands) {
        Integer result = 0;
        for (Integer oper : operands) {
            result += oper;
        }
        return result;
    }

    @Override
    public Integer sub(Integer operand1, Integer operand2) {
        return operand1 - operand2;
    }

    @Override
    public Integer multiplication(Integer... operands) {
        Integer result = 1;
        for (Integer oper : operands) {
            result *= oper;
        }
        return result;
    }


    public static void main(String[] args) {
        IntegerCalculator c1 = new IntegerCalculator();
        System.out.println(c1.add(1, 2));

        Calculator<Integer> c2 = new IntegerCalculator();
        System.out.println(c2.add(3, 4));

        Calculator<Integer> c3 = new IntegerCalculator();
        System.out.println(c3.multiplication(3, 2, 2));

        Calculator<Integer> c4 = new IntegerCalculator();
        System.out.println(c4.addMany(1, 2, 311, 412, 3, 21, 3));
    }
}
