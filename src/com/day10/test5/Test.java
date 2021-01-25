package com.day10.test5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student student1 =new Student("伟键哥哥",19,30000d);
        Student student2 =new Student("芙蓉姐姐",39,18000d);
        Student student3 =new Student("欧阳娜娜",19,45000d);
        Student student4 =new Student("上官婉儿",40,10000d);
        Student student5 =new Student("易烊千玺",19,3000d);

        ArrayList<Student> list =new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        Collections.sort(list);
//        System.out.println(list);
        for (Student s:list){     //还需要遍历
            System.out.println(s);
        }

//        Collections.sort(list);     不能这样。因为这样是比较内存地址
//        Comparator<Student> comparator=new Comparator<Student>() {

//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o1.getAge()==o2.getAge()){
//                    if (o2.getMoney()>o1.getMoney()){
//                        return 1;
//                    }else if (o2.getMoney()<o1.getMoney()){
//                        return -1;
//                    }else {
//                        return 0;
//                    }
//                }
////                return o2.getAge() - o1.getAge();
//            }
        };
    }
//}
