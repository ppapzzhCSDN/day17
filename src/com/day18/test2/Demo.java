package com.day18.test2;

public class Demo {
    public static void main(String[] args) throws Exception{
        SleepInterrupt si=new SleepInterrupt();
        Thread thread = new Thread(si);
        thread.start();
        Thread.sleep(0);
        thread.interrupt();

    }
}
