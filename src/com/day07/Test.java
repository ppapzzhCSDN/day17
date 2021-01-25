package com.day07;

import com.day7.Teacher;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.eat();
//        System.out.println(teacher.name1);
        System.out.println(teacher.name2);
        System.out.println(teacher.getName3());   //这是要调用这个方法 错第二次了？？？
//        System.out.println(String name4);
    }
}
