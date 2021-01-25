package com.day7;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
       Student.eat();
        System.out.println(Student.age); //成员变量一般是值 一般是打印出来

        student.study();
        Student.run();
    }
}
