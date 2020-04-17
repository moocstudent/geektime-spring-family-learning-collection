package com.example.genericparadigmdemo.paradigm.calculator;

public interface Calculator<T> {

    public T add(T operand1, T operand2);

    public T addMany(T...operands);

    public T sub(T operand1, T operand2);

    public T multiplication(T...operands);
}