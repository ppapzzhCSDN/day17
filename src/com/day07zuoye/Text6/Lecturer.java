package com.day07zuoye.Text6;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(int classno, String name) {
        super(classno, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("工号为"+classno +"的讲师"+name+"在讲课");
    }
}
