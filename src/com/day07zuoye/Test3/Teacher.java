package com.day07zuoye.Test3;

public class Teacher extends Person {
    String name;
    int age;
    private String classname;

    public Teacher() {
    }

    public Teacher(String name, int age, String classname) {
        this.name = name;
        this.age = age;
        this.classname = classname;
    }

    public Teacher(String name, int age, String name1, int age1, String classname) {
        super(name, age);
        this.name = name1;
        this.age = age1;
        this.classname = classname;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
    public void Teach(){
        System.out.println(getName()+"老师，讲授" +classname+"课");
    }
}