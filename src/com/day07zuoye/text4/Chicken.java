package com.day07zuoye.text4;

public class Chicken extends Animal {
    public Chicken() {
    }

    public Chicken(int age, String color) {
        super(age, color);
    }


    @Override
    public void eat() {
        System.out.println(getAge()+"岁"+getColor()+"的公鸡在啄米");
    }
    public void call(){
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}