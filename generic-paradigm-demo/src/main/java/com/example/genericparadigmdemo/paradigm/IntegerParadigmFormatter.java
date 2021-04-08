/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm;

public class IntegerParadigmFormatter extends ParadigmFormatter<Integer> {
    public IntegerParadigmFormatter(Integer lower, Integer upper) {
        super(lower, upper);
    }


    public static void main(String[] args) {
        ParadigmFormatter<Integer> v1 = new ParadigmFormatter<Integer>(1, 2);
        int lower = v1.getLower();
        int upper = v1.getUpper();
        System.out.println(lower + "," + upper);

        ParadigmFormatter<Integer> v2 = new ParadigmFormatter<>(1, 2);
        ParadigmFormatter<Integer> v3 = getReverse(v2);
        System.out.println(v3.getLower() + "," + v3.getUpper());
    }

    public static <T> ParadigmFormatter<T> getReverse(ParadigmFormatter<T> paradigmFormatter) {
        return new ParadigmFormatter<T>(paradigmFormatter.getUpper(), paradigmFormatter.getLower());
    }


}
