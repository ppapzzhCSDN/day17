package com.day17zuoye.work2;

import java.util.Random;

public class Demo2 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("编号为："+Thread.currentThread().getName());
            }
        };
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            Thread thread=new Thread(runnable,"姓名为张三"+random.nextInt(10));
            thread.start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
