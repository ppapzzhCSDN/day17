package com.day06zuoye;

import java.util.Scanner;

public class Person extends Player {
    public Person() {
    }

    public Person(String name, int score) {
        super(name, score);
    }

    public int boxing() {
        Scanner sc = new Scanner(System.in);   //相当于调用这个类sanner的参数
        System.out.println("请输入一个数 1剪刀  2石头  3布");
        int x = sc.nextInt();//必须输入一个整数
        while (true) {
            if (x == 1 || x == 2 || x == 3) {
                return x;
            } else {
                System.out.println("（温馨提醒）输入有误重新输入:     ");
                x = sc.nextInt();//必须输入一个一个整数 重新输入
            }
        }
    }

}
