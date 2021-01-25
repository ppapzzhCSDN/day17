package com.day06;

public class Person {
    String name;
    String leanno;
    String classno;

    public Person() {
    }

    public Person(String name, String leanno, String classno) {
        this.name = name;
        this.leanno = leanno;
        this.classno = classno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeanno() {
        return leanno;
    }

    public void setLeanno(String leanno) {
        this.leanno = leanno;
    }

    public String getClassno() {
        return classno;
    }

    public void setClassno(String classno) {
        this.classno = classno;
    }
    public void eat(){
        System.out.println("最近伙食怎么样");
    }
    public void sleep(){
        System.out.println("最近在睡觉===");
    }
}
