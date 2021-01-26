package com.day17.test11;

import com.day17zuoye.work4.Meng;

public class Demo {
    public static void main(String[] args) {
        Ticket ticket =new Ticket();
        ticket.setNum(100);
        ticket.setName("G9527");
        MyRun myRun=new MyRun(ticket);
        Thread thread=new Thread(myRun,"广州南");
        Thread thread2=new Thread(myRun,"深圳北");
        Thread thread3=new Thread(myRun,"汕尾战");

        thread.start();
        thread2.start();
        thread3.start();
    }
}
