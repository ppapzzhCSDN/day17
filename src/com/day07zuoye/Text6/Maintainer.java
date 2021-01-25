package com.day07zuoye.Text6;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(int classno, String name) {
        super(classno, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("工号为"+classno +"的维护专员"+name+"在解决不能共享的问题");

    }
}
