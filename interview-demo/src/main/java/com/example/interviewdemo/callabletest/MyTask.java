/*
 * Copyright (c) 2022. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.interviewdemo.callabletest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @Author: Frank
 * @Date: 2022-02-20 14:45
 */
public class MyTask implements Callable<Integer> {
    private int upperBounds;

    public MyTask(int upperBounds){
        this.upperBounds = upperBounds;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i=1;i<=upperBounds;i++){
         sum+=1;
        }
        return sum;
    }
}



class Test{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService service = Executors.newFixedThreadPool(10);
        for (int i=0;i<10;i++){
            list.add(service.submit(new MyTask((int)(Math.random()*100))));
        }

        int sum=0;
        for(Future<Integer> future:list){
            sum+=future.get();
        }

        System.out.println(sum);
    }
}