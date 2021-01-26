package com.day17.test7;

public class Demo {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread thread =new Thread(ticket,"窗口1");
        Thread thread2 =new Thread(ticket,"窗口2");
        Thread thread3 =new Thread(ticket,"窗口3");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
