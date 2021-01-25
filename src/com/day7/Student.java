package com.day7;

public  class Student {
    String name;
    static int age;


    public static void eat() {
        System.out.println("你今天伙食怎么样？？");
    }
    public static  void run(){
        eat();
        Student.eat();

    }
    public void study(){

    }

}