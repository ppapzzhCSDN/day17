package com.day16;

public class Digui3 {
    public static void main(String[] args) {   //出现StackOverflowError 栈溢出
       int num= 100;
       int sum = getsum(num);
        System.out.println(sum);
    }
    public static int getsum(int num){
        if (num ==1){
             return 1;
        }
        return num +getsum(num-1);

    }
}
