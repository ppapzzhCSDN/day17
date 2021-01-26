package com.day17.test5;

public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {
                    if(i == 10){
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("线程1："+ i);
                }
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <100; i++) {

                    System.out.println("线程2："+ i);
                }
            }
        };
        thread.start();
        thread2.start();
    }
}
