package com.day8.Test3;

public class Throwable2 {
    public static void main(String[] args) {
        int i = 0;
        String[] arr={"helloworld","hellodingdang","hellokitty"};
        try {                //try{}表示可能发生异常的语句
            while (i<4){
                System.out.println(arr[i]);
                i++;
            }
        } catch (Exception e) {         //catch( )内的参数异常类对象的声明
            e.printStackTrace();
            System.out.println("数组越界异常");
        };

        try {
            int a = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
