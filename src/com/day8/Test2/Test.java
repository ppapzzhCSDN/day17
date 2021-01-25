package com.day8.Test2;

public class Test {
    public static void main(String[] args) {
       Swim swim = new Swim() {     //如果是new Swim()只能是调用一个对象，因为方法体只有一个{}.swimming
            @Override
            public void swimming() {
                System.out.println("在狗刨式游泳");
            }

            @Override
            public void eat() {
                System.out.println("在使劲的吃饭");
            }
        };
        swim.swimming();
        swim.eat();

    }
}