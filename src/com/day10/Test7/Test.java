package com.day10.Test7;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        Student student =new Student("张三",11);
//        Student student2 =new Student("李四",11);
//        Student student3 =new Student("王五",11);
//        Student student4 =new Student("朱八",11);

        Map<Student,String> map=new HashMap<Student,String>();
        map.put(new Student("张三",11),"上海");
        map.put(new Student("李四",11),"上海");
        map.put(new Student("王五",11),"上海");
        map.put(new Student("劉六",11),"上海");
//        Collections.sort(map);
        Set<Student> set = map.keySet();
        for (Student kk:set){
            String value =map.get(kk);  //通過鍵到值得方式
            System.out.println(kk.toString()+"....."+value);
        }
        System.out.println(map.containsKey("张三"));
//        Set<Student> students = map.keySet();
//        for (Student cc:students)
//        System.out.println(map);

    }

}
