package com.example.genericparadigmdemo.paradigm;

public class ParadigmFormatter<T> {

    private T lower;
    private T upper;

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
