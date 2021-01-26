package com.day17.test6;

public class Demo {
    public static void main(String[] args) {
        Object obj=new Object();
        MyRun myRun = new MyRun(obj);
        MyRun2 myRun2 = new MyRun2(obj);

        Thread thread = new Thread(myRun);
        Thread thread2 = new Thread(myRun2);
        thread.start();
        thread2.start();
    }
}
