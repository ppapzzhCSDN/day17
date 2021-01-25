package com.day07zuoye.Text5;

public class Manner extends Person {

    public Manner() {
    }

    public Manner(String classno, String name, float xingshui) {
        super(classno, name, xingshui);
    }


    @Override
    public void eat() {
        System.out.println("工号为:" + getClassno() + ",姓名为" + getName() + "工资为" + getXingshui() + "经理在吃鱼");
    }

    public void work() {
        System.out.println("工号为:" + getClassno() + ",姓名为" + getName() + "工资为" + getXingshui() + "经理在工作，管理其他人");
    }
}
