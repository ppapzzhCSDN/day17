package com.day17.test;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("1");
        MyThread myThread =new MyThread("我不是潘金莲");
        // start 为启动线程
        myThread.start();
        // run是子线继承父类的方法  是main方法里面的 优先级比较高；
        myThread.run();
        MyThread myThread2 =new MyThread("我不是西门庆");

        System.out.println("2");
        System.out.println("3");
    }
}
