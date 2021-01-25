package com.day06;

public class Student extends Person{
        String name;
        String leanno;
    public void eat(){
        System.out.println("学生在大口喝酒 大口吃肉");
    }
    //重写了父类的sleep方法
    public void sleep(){
        super.sleep();          // 如果子类方法是增加新的功能，在执行增加的功能之前，通过super调用父类的方法。
        this.name="张三";       //相当于新增加父类这个sleep这个睡觉属性
        super.name="name";
        System.out.println("学生最近睡眠质量怎么样");
    }
    public void sleep(String where){

    }
    public void paituo(){
        System.out.println("学生最近在谈恋爱");
    }
    public Student(){
    }

    public Student(String name, String leanno) {
        this.name = name;
        this.leanno = leanno;
    }

    public Student(String name, String leanno, String classno, String name1, String leanno1) {
        super(name, leanno, classno);
        this.name = name1;
        this.leanno = leanno1;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLeanno() {
        return leanno;
    }

    @Override
    public void setLeanno(String leanno) {
        this.leanno = leanno;
    }
}
