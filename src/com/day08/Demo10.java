package com.day08;

public class Demo10 {
    private String name;
    private int age;

    @Override
    public String toString() {  //在实际开发中经常需要按照对象的属性得到相应的字符串表现形式，因此也需要重写它
        return "Demo10{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Demo10() {
    }

    public Demo10(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
