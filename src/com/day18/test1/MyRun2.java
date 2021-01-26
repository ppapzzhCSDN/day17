package com.day18.test1;

public class MyRun2 implements Runnable {
    private Object obj;

    public MyRun2() {
    }

    public MyRun2(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {


            synchronized (obj){
                System.out.println("线程2进入等待状态......");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程2被唤醒");
            }
        }
}
