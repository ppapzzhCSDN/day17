package com.day07zuoye.Text5;

public class Cooker extends Person{
    public Cooker() {
    }

    public Cooker(String classno, String name, float xingshui) {
        super(classno, name, xingshui);
    }

    @Override
    public void eat() {
        System.out.println("工号为:" + getClassno() + ",姓名为" + getName() + "工资为" + getXingshui() + "厨师在吃肉");
    }
    public void cooke(){
        System.out.println("工号为:" + getClassno() + ",姓名为" + getName() + "工资为" + getXingshui() + "的厨师在工作，炒菜");
    }
}
