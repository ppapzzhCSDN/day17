package com.day17zuoye.work5;

import java.util.concurrent.FutureTask;

public class Demo5 {
    public static void main(String[] args) throws Exception{
        MyRun myRun=new MyRun(10);
        MyRun myRun2=new MyRun(5);
        MyRun myRun3=new MyRun(8);
        FutureTask task=new FutureTask(myRun);
        FutureTask task2=new FutureTask(myRun2);
        FutureTask task3=new FutureTask(myRun3);
        Thread thread=new Thread(task);
        Thread thread2=new Thread(task2);
        Thread thread3=new Thread(task3);
        thread.start();
        thread2.start();
        thread3.start();
        System.out.println("阶乘10的结果为: " +task.get());
        System.out.println("阶乘5的结果为: " +task2.get());
        System.out.println("阶乘8的结果为: " +task3.get());
    }
}
