package com.day17.test5;

public class Demo3 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("守护线程1：" + i);
                }
            }
        });
        thread.setDaemon(true);
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("用户线程2：" + i);
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("用户线程3：" + i);
                }
            }
        });

        thread.start();
        thread2.start();
        thread3.start();
    }
}