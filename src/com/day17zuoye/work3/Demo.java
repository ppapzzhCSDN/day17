package com.day17zuoye.work3;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Object obj=new Object();
        Dian dian=new Dian(obj);
        Thread thread=new Thread(dian,"实体店");
        Thread thread2=new Thread(dian,"官网旗舰店");

        thread.start();
        thread2.start();
    }
}
