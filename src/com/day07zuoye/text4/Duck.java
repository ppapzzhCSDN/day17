package com.day07zuoye.text4;

public class Duck extends Animal{
    int age;
    String color;
    private String name;



    public Duck() {
    }

    public Duck(int age, String color) {
        this.age = age;
        this.color = color;
    }
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"鸭子在吃饭");
    }
    public void swimming(){
        System.out.println(getAge()+"岁的"+getColor()+"鸭子在游泳");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}