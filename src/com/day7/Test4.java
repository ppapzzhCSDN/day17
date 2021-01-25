package com.day7;

public class Test4 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.eat();
        System.out.println(teacher.name1);
        System.out.println(teacher.name2);
        System.out.println(teacher.getName3());   //这是要调用这个方法 错第二次了？？？
        System.out.println(teacher.name4);
    }
}
