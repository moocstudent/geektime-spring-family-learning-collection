package com.example.annotationdemo.repeatable;

public class RepeatableTest {

    @RepeatableAnnotation(a=1,b=2,c=3)
    @RepeatableAnnotation(a=1,b=2,c=4)
    public static void add(int a,int b,int c){
        if(c!=(a+b)){
            throw new ArithmeticException("Wrong");
        }
    }
}
