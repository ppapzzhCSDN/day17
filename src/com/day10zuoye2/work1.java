package com.day10zuoye2;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class work1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map =new HashMap<Integer, String>();
        map.put(01,"苹果");
        map.put(02,"香蕉");
        map.put(03,"西瓜");
        map.put(04,"橘子");
        Set<Integer> set =map.keySet();
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入你的编号：");
        int i = scanner.nextInt();
        if(!set.contains(i)){
            System.out.println("你输入的值有误！！");
        }else {
            System.out.println("编号"+i+"对应的商品为"+map.get(i));
        }
    }
}
