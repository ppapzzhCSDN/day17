package com.day18.test1;

public class Demo {
    public static void main(String[] args) {
        Object obj =new Object();
        MyRun1 myRun1=new MyRun1(obj);
        MyRun2 myRun2=new MyRun2(obj);
        MyRun3 myRun3=new MyRun3(obj);
        Thread t1=new Thread(myRun1);
        Thread t2=new Thread(myRun2);
        Thread t3=new Thread(myRun3);
//        t1.setPriority(10);
//        t2.setPriority(10);
//        t3.setPriority(1);
        t1.start();
        t2.start();
        t3.start();

    }
}
