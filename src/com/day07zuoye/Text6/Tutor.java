package com.day07zuoye.Text6;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(int classno, String name) {
        super(classno, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("工号为"+classno +"的助教"+name+"在帮助学生解决问题");
    }
}
