package com.day10.test3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        HashSet<Student> stuSet=new HashSet<>();
        Student stu = new Student("伟键哥哥",18);
        stuSet.add(new Student("郭德纲", 44));
        stuSet.add(new Student("赵本山", 44));
        stuSet.add(new Student("宋丹丹", 44));
        stuSet.add(stu);
        for (Student student: stuSet) {   //增强for循环
            System.out.println(student);

        };


    }
}
