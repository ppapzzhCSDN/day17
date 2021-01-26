package com.day17.test8;

public class MyRun implements Runnable {
    private TicketBean ticketBean;

    public MyRun() {
    }

    public MyRun(TicketBean ticketBean) {
        this.ticketBean = ticketBean;
    }

    @Override
    public void run() {
        while (true){
            synchronized (ticketBean){
                if(ticketBean.getNum()<=0){
                    System.out.println("票卖完啦");
                    break;
                }
                System.out.println("票名："+ticketBean.getName() +" 卖票:"+Thread.currentThread().getName()+" 票号"+ticketBean.getNum());
                ticketBean.setNum(ticketBean.getNum()-1);
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
