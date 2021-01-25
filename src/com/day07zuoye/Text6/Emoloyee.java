package com.day07zuoye.Text6;

public abstract class Emoloyee {
    int classno;
    String name;
    public abstract void work();

    public Emoloyee() {
    }

    public Emoloyee(int classno, String name) {
        this.classno = classno;
        this.name = name;
    }

    public int getClassno() {
        return classno;
    }

    public void setClassno(int classno) {
        this.classno = classno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
