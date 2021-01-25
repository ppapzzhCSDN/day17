package com.day06zuoye;

import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        System.out.println("游戏开始");
        Scanner sc = new Scanner(System.in);       //scanner 传进来 继续循环
        Person p1 = new Person("李大国", 0);
        Pcperson pc = new Pcperson("张小小", 0);
        while (true) {
            int quan1 = p1.boxing();
            int quan2 = pc.boxing();
            if (quan1 == quan2) {
                p1.setScore(p1.getScore() + 1);   //获取值 p1.setScore=p1.getScore()+1
                pc.setScore(pc.getScore() + 1);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            } else if (quan1 == 1 && quan2 == 2) {
                p1.setScore(p1.getScore() + 3);
                pc.setScore(pc.getScore() - 3);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            } else if (quan1 == 1 && quan2 == 3) {
                p1.setScore(p1.getScore() - 3);
                pc.setScore(pc.getScore() + 3);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            } else if (quan1 == 2 && quan2 == 1) {
                p1.setScore(p1.getScore() + 3);
                pc.setScore(pc.getScore() - 3);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            }else if (quan1 == 2 && quan2 == 3) {
                p1.setScore(p1.getScore() - 3);
                pc.setScore(pc.getScore() + 3);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            }else if (quan1 == 3 && quan2 == 1) {
                p1.setScore(p1.getScore() - 3);
                pc.setScore(pc.getScore() + 3);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            }else if (quan1 == 3 && quan2 == 2) {
                p1.setScore(p1.getScore() + 3);
                pc.setScore(pc.getScore() - 3);
                System.out.println("玩家获得分数" + p1.getScore() + "\n" + "电脑玩家获得的分数:" + pc.getScore());
            }
            System.out.println("游戏结束，是否继续 Y/N");
            String z = sc.nextLine();//接受键盘输入的字符  netLine()  接受键盘输入的值
            if (z.equals("N")){
                break;
            }
        }
        System.out.println("游戏结束"+"玩家获得的分数为:"+p1.getScore() +"电脑获得的分数为:" +pc.getScore());
    }
}
