package com.example.proxydemo.subject;

import org.springframework.stereotype.Service;

/**
 * 类似最终实现类要执行的方法
 */
@Service
public class SubjectImpl implements Subject{
    @Override
    public void request() {
        System.out.println("SubjectImpl request()");
    }

    @Override
    public Integer submit(Process process) {
        System.out.println("saved process:"+process);
        return 1;
    }

}
