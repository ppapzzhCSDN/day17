package com.day17.test3;

import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws Exception{
        System.out.println("1");
        Mycoll mycoll =new Mycoll();
        FutureTask task =new FutureTask(mycoll);
        Thread thread=new Thread(task);
        thread.start();
        System.out.println(task.get());

        System.out.println("2");
        System.out.println("3");
    }
}
