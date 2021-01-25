package com.day8;

public class Test {
    public static void main(String[] args) {
        Swin swin = new Swin() {
            @Override
            public void eat() {
                System.out.println("经理吃米饭");
                System.out.println("厨师在白粥");
            }

            @Override
            public void work() {
                System.out.println("经理在管理其他人");
                System.out.println("厨师在炒菜");

            }
        };
        swin.eat();
        swin.work();




    }
}
