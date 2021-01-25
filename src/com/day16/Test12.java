package com.day16;

public class Test12 {
    public static void main(String[] args) {
//        int num=0;
//        for (int i = 0; i <=100 ; i++) {
//            num=num+i;
//        }
//        System.out.println(num);
//
     int i=0;
     int num=0;
        while (true) {
            i=i+1;
            num = num + i;
            if(i==100){
                break;
            }
        }
        System.out.println(num);
        }
 }
