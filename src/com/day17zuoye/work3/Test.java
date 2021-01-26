package com.day17zuoye.work3;

public class Test {
    public static void main(String[] args) {
        Class c=new Class();
        Thread thread1 = new Thread(c, "实体店");
        Thread thread2 = new Thread(c, "官网");
        thread1.start();
        thread2.start();
    }
}
