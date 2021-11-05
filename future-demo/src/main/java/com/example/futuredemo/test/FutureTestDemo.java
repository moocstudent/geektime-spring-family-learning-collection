/*
 * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.futuredemo.test;

import lombok.Data;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Author: zhangQi
 * @Date: 2021-11-04 9:58
 */
public class FutureTestDemo {

    @Data
    public static class Result{
        private int code;
        private String msg;
    }

    public Future<Result> getTest(){
        Result result = new Result();
        result.setCode(100);
        result.setMsg("hello");
        return CompletableFuture.completedFuture(result);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTestDemo futureTestDemo = new FutureTestDemo();
        Future<Result> test = futureTestDemo.getTest();
        System.out.println(test.get());
    }
}
