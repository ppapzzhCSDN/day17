package com.day17zuoye.work1;

public class MyRun2 implements Runnable {
    private Object obj;

    public MyRun2(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //加上同步代码块锁住
            synchronized (obj) {
                System.out.print("提");
                System.out.print("莫");
                System.out.print("必");
                System.out.print("需");
                System.out.print("死");
                System.out.println();
            }
        }
    }
}
