package com.day08;

import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的值：");
            String i = scanner.nextLine();
            if (i.equals("end")) {
                System.out.println("退出本次循环");
                return;
            }
            System.out.println("输入的值为" +i);

        }
    }
}
