package com.day007zuoye.work4;

public class SportStudent extends Student implements Sport{
    @Override
    public void playBasketball() {
        System.out.println("年龄为" + getAge() + "岁 " + getName() + " 的学生在打篮球");
    }

    public SportStudent() {
    }

    public SportStudent(String name, int age) {
        super(name, age);
    }
}
