package com.day04;

public class Text {
    public static void main(String[] args) {
        Cat c = new Cat();   //创建一个对象 调用cat()里面的粒面的类
        c.eat();
        c.run();
        c.getAge();
        c.height=12;
        System.out.println(c.height);
    }
}
