package com.day07zuoye.Text6;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    public Buyer(int classno, String name) {
        super(classno, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("工号为"+classno +"采购专员"+name+"在采购音响设备");
    }
}
