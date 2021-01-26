package com.day17.test;

public class MyThread extends Thread {
    private String name;
        public MyThread(){
    }
    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("你好世界");
        Thread thread=Thread.currentThread();
        System.out.println("当前线程名字:"+name);
        System.out.println("当前线程:"+thread.getId());
    }

}
