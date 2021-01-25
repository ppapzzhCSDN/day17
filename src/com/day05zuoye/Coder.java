package com.day05zuoye;

public class Coder {
    private String name;
    private int num;
    private double sarlay;
    public Coder(){
    }
    public Coder(String name,int num,double sarlay){
        this.name = name;
        this.num= num;
        this.sarlay=sarlay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getSarlay() {
        return sarlay;
    }

    public void setSarlay(double sarlay) {
        this.sarlay = sarlay;
    }
    public void intro(){
        System.out.println("程序员的姓名为："+name +"工号为:" +num);
    }
    public void showSalary(){
        System.out.println("基本工资为:" +sarlay);
    }
    public void work(){
        System.out.println("正在努力写代码.....");
    }
}