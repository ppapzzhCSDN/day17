package com.day17.test6;

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
                System.out.print("犯");
                System.out.print("我");
                System.out.print("中");
                System.out.print("华");
                System.out.print("者");
                System.out.println();
            }
        }
    }
}
