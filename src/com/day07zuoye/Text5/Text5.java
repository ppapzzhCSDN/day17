package com.day07zuoye.Text5;

import com.day05zuoye.Manager;

public class Text5 {
    public static void main(String[] args) {

        Manner manner=new Manner("m100","老王",10000.0f);
        manner.eat();
        manner.work();
        Cooker cooker =new Cooker("c100","小王",6000);
        cooker.eat();
        cooker.cooke();

    }
}
