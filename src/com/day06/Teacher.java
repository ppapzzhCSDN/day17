package com.day06;

public class Teacher extends Person{
    String name;
    String leanno;
    public void eat(){
        System.out.println("老师最近睡眠怎么样");
    }
    public void sleep(){
        System.out.println("老师最近睡眠怎么样");
    }
    public void shangke(){
        System.out.println("老师在教书 请勿打扰");
    }
    public Teacher() {
    }

    public Teacher(String name, String leanno) {
        this.name = name;
        this.leanno = leanno;
    }

    public Teacher(String name, String leanno, String classno, String name1, String leanno1) {
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
