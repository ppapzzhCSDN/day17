package com.day17.test8;

import com.day17.test7.Ticket;

public class Demo {
    public static void main(String[] args) {
        TicketBean ticketBean =new TicketBean();
        ticketBean.setNum(50);
        ticketBean.setName("上海堡垒");

        MyRun myRun=new MyRun(ticketBean);
        Thread thread =new Thread(myRun,"窗口1");
        Thread thread2 =new Thread(myRun,"窗口2");
        Thread thread3 =new Thread(myRun,"窗口3");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
