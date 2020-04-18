package com.example.proxydemo.multiple;

public class CookImpl implements Cook{
    @Override
    public void doWork() {
        System.out.println("Cook for myself");
    }
}
