package com.day08;

public class Demo2 {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());
        long start =System.currentTimeMillis();
        String a = "hello world";
        for (int i = 0; i <100 ; i++) {
            System.out.println(a);
        }
        long end =System.currentTimeMillis();
        System.out.println("打印时间为:"+ (end-start));
    }
}
