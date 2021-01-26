package com.day17.test5;

public class Demo4 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println();
            }
        });
    }
}
