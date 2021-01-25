package com.day08;

import java.util.Scanner;

public class Deno3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输出第一个数字：");
        int i = scanner.nextInt();
        System.out.println("i="+ i);
        System.out.println("请输出第二个数字：");
        int i2 =scanner.nextInt();
        System.out.println("i2="+ i2);
        System.out.println("请输出第三个数字：");
        int i3 =scanner.nextInt();
        System.out.println("i3="+ i3);

        int temp =i>i2?i:i2;
        int max =temp>i3?temp:i3;
        System.out.println("这三个数的最大值是" +max);

    }

}
