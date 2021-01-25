package com.day17.work;

public class Demo2 {
    public static void main(String[] args) {
        b(1);
    }
    public static void b(int i){
        System.out.println(i);
        if(i ==50){
            return;
        }b(++i);
    }
}
