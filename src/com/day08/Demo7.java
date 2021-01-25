package com.day08;

import java.util.Random;
import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Random random =new Random();
        Scanner scanner = new Scanner(System.in);
        int a =random.nextInt(100)+1;  //这个随机数生成是在外面的  不然会随机生成遍历
        while (true){
            System.out.println("请输入你的1-100之间的随机数：");
            int b =scanner.nextInt();
            if (b<a){
                    System.out.println("客官，你的随机数有点 小了");
                }else if (b>a){
                    System.out.println("客官 ，你的随机数有点儿大 ");
                }else {
                    System.out.println("恭喜你猜中了");
                    System.out.println(a);
                    break;
                }

        }
    }
}
