/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm.calculator;

import com.example.genericparadigmdemo.paradigm.ParadigmFormatter;

public class IntervalCalculator implements Calculator<ParadigmFormatter<Integer>> {
    @Override
    public ParadigmFormatter<Integer> add(ParadigmFormatter<Integer> operand1, ParadigmFormatter<Integer> operand2) {
        int lower = operand1.getLower() + operand2.getLower();
        int upper = operand1.getUpper() + operand2.getUpper();
        return new ParadigmFormatter<Integer>(lower,upper);
    }

    public static void main(String[] args) {
        Calculator<ParadigmFormatter<Integer>> c = new IntervalCalculator();
        ParadigmFormatter<Integer> operand1 = new ParadigmFormatter<>(1,2);
        ParadigmFormatter<Integer> operand2 = new ParadigmFormatter<>(3,4);
        ParadigmFormatter<Integer> operand3 = c.add(operand1, operand2);
        System.out.println(operand3.getLower());
    }

    @Override
    public ParadigmFormatter<Integer> addMany(ParadigmFormatter<Integer>... operands) {
        return null;
    }

    @Override
    public ParadigmFormatter<Integer> sub(ParadigmFormatter<Integer> operand1, ParadigmFormatter<Integer> operand2) {
        return null;
    }

    @Override
    public ParadigmFormatter<Integer> multiplication(ParadigmFormatter<Integer>... operands) {
        return null;
    }
}
