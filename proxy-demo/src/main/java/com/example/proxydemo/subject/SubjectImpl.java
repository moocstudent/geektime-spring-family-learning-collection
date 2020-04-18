package com.example.proxydemo.subject;

public class SubjectImpl implements Subject{
    @Override
    public void request() {
        System.out.println("SubjectImpl request()");
    }

    @Override
    public void response() {
        System.out.println("SubjectImpl response()");
    }
}
