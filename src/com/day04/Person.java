package com.day04;

public class Person {
    public static void main(String[] args) {


        User user = new User();   //实例化对象后是  小写   注意
        User user5 =new User("马保国");
        User user4 = new User("马保国",18 );    //这是系统自带的
        user.eat();
        int result=user.sum(33,44);
        System.out.println(user.sum(22,33));
        System.out.println(result);
        User user2 = new User("eeee", 3.0f);
        User user3 = new User("eee", 33.3f, 3232.90);
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getHeight());
        user.setName("xiaoming");
        System.out.println(user.getName());
    }
}
