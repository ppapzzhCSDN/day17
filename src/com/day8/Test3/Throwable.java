package com.day8.Test3;

public class Throwable {
    public static void main(String[] args) {
        System.out.println("hello");
        try {
            int a = 1/0;
            return;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }finally {
            System.out.println("world");
        }
    }
}
