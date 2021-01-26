package com.day17.Test2;

public class Demo1 {
    public static void main(String[] args) {

        System.out.println("1");
        MyRun myRun =new MyRun();
        Thread thread=new Thread(myRun,"伟健哥哥的线程"); //ID是CPU传参，所以不能传
        thread.start();


        System.out.println("2");
        System.out.println("3");
    }
}
