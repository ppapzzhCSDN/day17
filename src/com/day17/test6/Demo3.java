package com.day17.test6;

public class Demo3 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(() ->{                            //为什么兰不打表达式重写父类的run 方法？？？？？？
                for (int i = 0; i < 100; i++) {                 //()-就代表run方法 这是省略run方法的形式 改进 相当于{}里面就是run
                    synchronized (obj) {
                        System.out.print("团");
                        System.out.print("战");
                        System.out.print("可");
                        System.out.print("以");
                        System.out.print("输");
                        System.out.println("");
                    }
                }
        }).start();
        new Thread(()-> {
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
        }).start();
    }
}
