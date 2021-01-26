package com.day17.Test2;

public class MyRun implements Runnable{
    @Override
    public void run() {
        System.out.println("当前线程："+Thread.currentThread().getId());
        System.out.println("当前线程名字："+Thread.currentThread().getName());
    }
}
