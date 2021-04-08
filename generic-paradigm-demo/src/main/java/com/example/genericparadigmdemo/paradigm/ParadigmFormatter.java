/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.genericparadigmdemo.paradigm;

public class ParadigmFormatter<T> {

    private final T lower;
    private final T upper;

    public ParadigmFormatter(T lower, T upper){
        this.lower = lower;
        this.upper = upper;
    }

    public T getLower(){
        return lower;
    }

    public T getUpper(){
        return upper;
    }

}
