package com.day04;

public class User {
    private String name = "xiaoming";
    private float age = 100.1f;
    private double height = 1212.21d;

    String num;

    public void eat() {
        name = "马保国";
        num = "";
        System.out.println(name);
        System.out.println(name+"吃饭");

    }

    public int sum(int a, int b){
        return a * b;  //  求a+b 得和
    }
    public void setName(String abc) {
        this.name = abc;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public float getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public User() {
        System.out.println("打印出一无参数的方法");
    }

    public User(String name) {
        System.out.println("准备好了吗 召唤师" + age);
    }

    public User(String name, float age) {
        System.out.println("今天是缘起满满的一天" + name);
    }

    public User(String name, float age, double height) {
        System.out.println("你好世界" + age);
    }
}