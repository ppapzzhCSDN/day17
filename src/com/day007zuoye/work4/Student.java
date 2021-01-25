package com.day007zuoye.work4;

public class Student extends Person{
    @Override
    public void eat() {
        System.out.println("年龄" + getAge() + "岁的 " + getName() + " 在吃学生餐");
    }

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
