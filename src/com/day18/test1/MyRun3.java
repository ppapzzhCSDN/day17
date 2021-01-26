package com.day18.test1;

public class MyRun3 implements Runnable {
    private Object obj;

    public MyRun3() {
    }

    public MyRun3(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
            synchronized (obj){
                System.out.println("线程3进入等待状态......");
                obj.notifyAll();
                System.out.println("线程3被唤醒");
            }
        }
}
