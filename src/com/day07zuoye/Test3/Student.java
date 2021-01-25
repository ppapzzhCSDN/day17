package com.day07zuoye.Test3;

public class Student extends Person {
    String name;
    int age;
    private int score;

    public Student() {
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public Student(String name, int age, String name1, int age1, int score) {
        super(name, age);
        this.name = name1;
        this.age = age1;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void exam(){
        System.out.println(getName()+"同学，考试得了"+score+"分");
    }
}