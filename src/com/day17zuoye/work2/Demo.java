package com.day17zuoye.work2;

import com.day17.test.MyThread;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Object obj = new Object();
        Shandong shandong=new Shandong(obj);
        Thread thread=new Thread(shandong,"张三");
        Thread thread2=new Thread(shandong,"李四");
        Thread thread3=new Thread(shandong,"王五");
        Thread thread4=new Thread(shandong,"刘六");
        Thread thread5=new Thread(shandong,"周七");
        Thread thread6=new Thread(shandong,"朱八");
        Thread thread7=new Thread(shandong,"赵九");
        Thread thread8=new Thread(shandong,"曾十");
        Thread thread9=new Thread(shandong,"威哥");
        Thread thread10=new Thread(shandong,"七七");
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();


    }
}
