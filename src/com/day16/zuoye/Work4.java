package com.day16.zuoye;

import java.io.File;
import java.util.Scanner;

public class Work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的验证信息:");
        String str = scanner.nextLine();
        File file = new File("D\\data.txt");
        String[] dir = file.list();
        for (int i = 0; i <dir.length ; i++) {
            {
                System.out.println("请继续输出你的字符串");
            }

        }


    }
//        while ((b = file.()) != -1){

}



