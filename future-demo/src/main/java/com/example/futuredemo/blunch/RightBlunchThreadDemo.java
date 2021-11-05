///*
// * Copyright (c) 2021. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
// * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
// * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
// * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
// * Vestibulum commodo. Ut rhoncus gravida arcu.
// */
//
//package com.example.futuredemo.blunch;
//
///**
// * @Author: zhangQi
// * @Date: 2021-11-04 10:55
// */
//public class RightBlunchThreadDemo {
//
//
//    private static volatile boolean seafoodNoddleSoupIsOk = false;
//
//    private static class SeafoodNoddleSoupThread extends Thread{
//        @Override
//        public void run() {
//            try{
//                Thread.sleep(3000L);
//                seafoodNoddleSoupIsOk = true;
//                System.out.println("水已经烧开");
//            }catch (InterruptedException e){
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private static class TeaThread extends Thread {
//        @Override
//        public void run() {
//            try {
//                if (seafoodNoddleSoupIsOk) {
//                    Thread.sleep(1000L);
//                    System.out.println("茶泡好了");
//                } else {
//                    System.out.println("没有热水");
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//
//        //先做海鲜汤面 3000 m seconds
//        com.example.futuredemo.blunch.SeafoodNoddleSoupThread seafoodNoddleSoupThread = new com.example.futuredemo.blunch.SeafoodNoddleSoupThread();
//        seafoodNoddleSoupThread.start();
//        seafoodNoddleSoupThread.join();
//
//        //再来点炸肉 5000 m seconds
//        FriedMeatThread friedMeatThread = new FriedMeatThread();
//        friedMeatThread.start();
//        friedMeatThread.join();
//
//        long end = System.currentTimeMillis();
//        System.out.println("blunch准备完毕:"+(end-start));
//
//    }
//
//}
