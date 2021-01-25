package com.day05zuoye;

public class Cheshi {
    public static void main(String[] args) {


        Coder coder = new Coder("james",9527,15000.0);
        Manager manager = new Manager("KOBE",0025,10000d);
        coder.intro();
        coder.showSalary();
        coder.work();
        manager.intro();
        manager.showSalary();
        manager.work();


    }
}