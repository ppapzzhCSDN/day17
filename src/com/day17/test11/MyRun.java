package com.day17.test11;

public class MyRun implements Runnable{
    private Ticket ticket=new Ticket();

    public MyRun() {
    }

    public MyRun(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public void run() {
        while (true){
            synchronized (ticket){
                int num=ticket.getNum();
                if(num<=0){
                    System.out.println("抱歉，票卖完啦");
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"票名"+ticket.getName()+"剩余票数"+num);
                ticket.setNum(num-1);
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
