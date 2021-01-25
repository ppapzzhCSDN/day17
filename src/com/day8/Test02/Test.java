package com.day8.Test02;
//匿名内部类的使用
public class Test {

    public static void swim(Swim s){    //传递一个借口对象 然后调用这个s  关这个swim无关
        s.swimming();
    }
    public static void main(String[] args) {
        Student student =new Student();
        swim(student);
        swim(new Swim() {
            @Override
            public void swimming() {
                System.out.println("在狗刨式游泳");
            }
        });
        swim(new Swim() {
            @Override
            public void swimming() {
                System.out.println("在蛙泳");

            }
        });


    }
}
