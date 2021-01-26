package com.day17zuoye.work1;

public class MyRun implements Runnable {
    private Object obj;

    public MyRun(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //加上同步代码块锁住
            synchronized (obj) {
                System.out.print("团");
                System.out.print("战");
                System.out.print("可");
                System.out.print("以");
                System.out.print("输");
                System.out.println();
            }
        }

    }
}
