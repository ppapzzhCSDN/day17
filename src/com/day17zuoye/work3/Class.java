package com.day17zuoye.work3;

public class Class implements Runnable {
    private Integer sum = 100;
    Object obj = new Object();
    int dian1num = 0;
    int dian2num = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (sum <= 0) {
                    System.out.println("抱歉卖完啦");
                    break;
                }
                if (Thread.currentThread().getName() == "实体店") {
                    dian1num++;
                }
                dian2num++;
            }
            System.out.println(Thread.currentThread().getName()+sum--);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
