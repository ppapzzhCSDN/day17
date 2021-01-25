package com.day9zuoye.work1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("请输入第一个数：");
            int x1 =scanner.nextInt();
            System.out.println("请输入第二个数： ");
            int x2 =scanner.nextInt();
            System.out.println("请输入第三个数: ");
            int x3 =scanner.nextInt();
            int temp =x1>x2?x1:x2;
            int max=temp>x3?temp:x3;
            System.out.println("最大数为："+max);
            break;

        }
    }
}
