package com.example.aopdemo.impl;

import com.example.aopdemo.Person;

public class PersonImpl implements Person {
    @Override
    public void eat() {
        System.out.println("想吃牛油果");
    }

    @Override
    public void washHand() {
        System.out.println("洗手讲卫生");
    }

    @Override
    public void bath() {
        System.out.println("洗澡去臭臭");
    }
}
