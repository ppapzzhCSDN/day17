package com.day04;

public class Cat {
    private String name = "捏好呀";
    private int age = 13;
    double height = 18;

    public void getName(String n){
        name=n;
    }
    public int getAge(){
        return age;
    }
    public void run() {     //跑的方法
        System.out.println("这只汤姆猫在快乐地");
    }

    public void eat() {
        System.out.println("吃的怎么样");
    }
    public static void study(){
        System.out.println("建哥帅帅的");
    }
}