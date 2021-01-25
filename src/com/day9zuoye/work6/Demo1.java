package com.day9zuoye.work6;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        String mgc ="奥巴马";
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你的爱好：");
//        String str = "我喜欢奥巴马呀，还喜欢普金";
        String str =scanner.nextLine();

        System.out.println(str);
        String str1 =str.replace(mgc,"*");    //本来就是字符串
        System.out.println(str1);

    }
}
