package com.day10.day010;

import java.util.HashSet;

public class Demo5test {
    public static void main(String[] args) {
        HashSet<Student> stuset =new HashSet<Student>();
        Student stu =new Student("于谦",39);
        Student stu2 =new Student("宋小宝",33);
//        Student stu3 =new Student("李连",31);
//        Student stu4 =new Student("小小风",19);
        stuset.add(new Student("李连杰",52));
        stuset.add(new Student("小小凤",22));
        stuset.add(new Student("锦织圭",32));
        stuset.add(stu);
//        System.out.println(stuset);
        for(Student kk:stuset){
            System.out.println(kk);
        }

    }
}
