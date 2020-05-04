package com.example.nettydemo.bio;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Blocking IO
 * 测试
 * telnet 127.0.0.1 6666
 * ctrl+]
 * send 数据
 * Microsoft Telnet> send hello
 * @author ukzq
 */
public class BIOServer {

    public static void main(String[] args) throws IOException {
        //创建线程池
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        //创建ServerSocket
        ServerSocket serverSocket = new ServerSocket(6666);
        System.out.println("BIOServer服务器启动了");

        while(true){
            System.out.println("线程信息id="+Thread.currentThread().getId()+",名字="+Thread.currentThread().getName());
            //监听,等待客户端连接
            System.out.println("等待连接...");
            final Socket socket = serverSocket.accept();
            System.out.println("连接到一个客户端");

            //就创建一个线程,与之通讯(单独写一个方法)
            cachedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    //可以和客户端通讯
                    handler(socket);
                }
            });
        }
    }

    //编写一个handler方法，和客户端通讯
    public static void handler(Socket socket) {

        try {
            System.out.println("线程信息 id =" + Thread.currentThread().getId() + " 名字=" + Thread.currentThread().getName());
            byte[] bytes = new byte[1024];
            //通过socket 获取输入流
            InputStream inputStream = socket.getInputStream();

            //循环的读取客户端发送的数据
            while (true) {

                System.out.println("线程信息 id =" + Thread.currentThread().getId() + " 名字=" + Thread.currentThread().getName());

                System.out.println("read....");
                int read =  inputStream.read(bytes);
                if(read != -1) {
                    System.out.println(new String(bytes, 0, read
                    )); //输出客户端发送的数据
                } else {
                    break;
                }
            }


        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("关闭和client的连接");
            try {
                socket.close();
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
