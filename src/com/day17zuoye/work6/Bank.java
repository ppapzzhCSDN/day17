//package com.day17zuoye.work6;
//
//public class Bank {
//    static Integer count=3;
//    static Integer salary;
//    Object obj=new Object();
//    public static void main(String[] args) {
//        Thread thread=new Thread(new Runnable() {
//            @Override
//            public void run() {
//            while (true){
//                synchronized (obj){
//                    if(count<=0){
//                        System.out.println("存完钱了" +"余额为："+salary);
//                        break;
//                    }
//                    salary=salary+100;
//                    System.out.println("储户1"+Thread.currentThread().getName());
//                }
//            }
//            }
//        }).start();
//        Thread thread2=new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    synchronized (obj){
//                        if(count<=0){
//                            System.out.println("存完钱了" +"余额为："+salary);
//                            break;
//                        }
//                        salary=salary+100;
//                        System.out.println("储户2"+Thread.currentThread().getName());
//                    }
//                }
//            }
//        }).start();
//    }
//}
