package com.day17.test10;

public class Demo2 {
    public static void main(String[] args) {
        Demo1 demo1=new Demo1();
        Thread thread=new Thread(demo1,"窗口1");
        Thread thread2=new Thread(demo1,"窗口2");
        Thread thread3=new Thread(demo1,"窗口3");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
