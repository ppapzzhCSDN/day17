package com.day18.test1;

public class MyRun1 implements Runnable{
    private Object obj;

    public MyRun1() {
    }

    public MyRun1(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
            synchronized (obj){
                System.out.println("线程1进入等待状态......");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程1被唤醒");
            }
        }
}
