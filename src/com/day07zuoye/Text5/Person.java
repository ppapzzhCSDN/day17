package com.day07zuoye.Text5;

public abstract class Person {
    String classno="zhangsan";
    String name;
    float xingshui;
    public abstract void eat();

    public Person() {
    }

    public Person(String classno, String name, float xingshui) {
        this.classno = classno;
        this.name = name;
        this.xingshui = xingshui;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getXingshui() {
        return xingshui;
    }

    public void setXingshui(float xingshui) {
        this.xingshui = xingshui;
    }
}
