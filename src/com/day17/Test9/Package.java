package com.day17.Test9;

public class Package implements Runnable{

    private int packages = 100;
    Object object = new Object();

    static int count = 0;
    int num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (packages > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (Thread.currentThread().getName().equals("实体店")) {
                        count++;
                    } else {
                        num++;
                    }
                    System.out.println(Thread.currentThread().getName() + "===" + packages--);
                    if (packages==0){
                        System.out.println("实体店共卖出了" + count + "个");
                        System.out.println("官网共卖出了"+num+"个");
                        break;
                    }
                }
            }
        }
    }
}
