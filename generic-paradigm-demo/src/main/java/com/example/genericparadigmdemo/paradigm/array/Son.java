package com.example.genericparadigmdemo.paradigm.array;

public class Son extends Father {

    /**
     * 返回值可以是B也可以是C
     * @param obj
     * @return
     */
    @Override
    public C f1(B obj){
        System.out.println("Son.f1()");
        return new C();
    }

}
