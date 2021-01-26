package com.day17.test7;

public class Ticket implements Runnable{
    private Integer num=100;
    private Object obj =new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (num <= 0) {
                    System.out.println("票卖完啦 欢迎下次再来");
                    break;
                }
                System.out.println("窗口" + Thread.currentThread().getName() + "票号"+num);
                num--;
            }
        }
    }
}
