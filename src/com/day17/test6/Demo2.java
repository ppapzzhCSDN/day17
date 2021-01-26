package com.day17.test6;

public class Demo2 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (obj) {
                        System.out.print("团");
                        System.out.print("战");
                        System.out.print("可");
                        System.out.print("以");
                        System.out.print("输");
                        System.out.println("");
                    }
                }
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    synchronized (obj) {
                        System.out.print("提");
                        System.out.print("莫");
                        System.out.print("必");
                        System.out.print("须");
                        System.out.print("死");
                        System.out.println("");
                    }
                }
            }
        }.start();
    }
}
