package com.day8.test;

public class Demo2 {
    public static void main(String[] args) {
//        int i = 0;
//            String arr[] = {"hello", "world", "aini", "zuijinhaoma "};
//            try {
//                while (i < 4) {
//                    System.out.println(arr[i]);
//                    i++;
//                }
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("数组越界异常");
        int i = 0;
        String greetings[] = { "Hello World", "Hello Dingdang", "Hello Kitty" };
        try {
            while (i < 4) {
                System.out.println(greetings[i]);
                i++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常");
        }
//
    }
}