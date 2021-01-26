package com.day17zuoye.work4;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Meng meng=new Meng();
        meng.setNum(80);
        meng.setName("公交车");
        MyRun myRun=new MyRun(meng);
        Thread thread=new Thread(myRun,"前门");
        Thread thread2=new Thread(myRun,"中门");
        Thread thread3=new Thread(myRun,"后门");
        thread.start();
        thread2.start();
        thread3.start();
    }


}
