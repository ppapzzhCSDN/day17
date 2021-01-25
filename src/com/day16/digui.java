package com.day16;

public class digui {
    public static void main(String[] args) {
        b(1);
    }
    public static void b(int i){
        System.out.println(i);
        if(i>=1000){
            return;
        }
        b(++i);   // 这个是调用自己
    }
}
