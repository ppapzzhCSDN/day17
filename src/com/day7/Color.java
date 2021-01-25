package com.day7;

public class Color extends Cat {
    String name ="张三";
    int age = 1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void eat() {
        System.out.println("子类吃饭");
    }

    public void jiba() {
        super.eat();
        this.eat();
        niubi();
    }

    public static void niubi() {
        Color color = new Color();
//        color.jiba();
//        System.out.println("牛逼");
    }


}

