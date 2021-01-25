package com.day06;

public class Test {
    public static void main(String[] args) {
        Person ppap = new Person("威哥","11","计科一班");
        Student s1 = new Student();  //构造方法不可以继承？？

        s1.eat();  //方法可变量是可以被继承
        s1.sleep();
    }
}
