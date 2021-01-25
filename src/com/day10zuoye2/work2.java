package com.day10zuoye2;

import java.util.HashMap;
import java.util.Scanner;

public class work2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
//        map.put("张三",18);
//        map.put("李四",38);
//        map.put("王五",3);
//        map.put("赵六",48);
//        map.put("周七",28);

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int a=0;
        int b =0;

        while (true) {
            if (map.size() < 5) {
//                System.out.println("请输入你第" + i + "个学生姓名");
                System.out.println("姓名：");
                String n = scanner.next();
                System.out.println("年龄：");
                int k = scanner2.nextInt();
                map.put(n, k);
                if(k>a){
                    a=k;
                }b+=k;
            }else {
                break;
            }

        }
        System.out.println("最大数"+ a);
        System.out.println("平均数"+b/map.size());
    }
}