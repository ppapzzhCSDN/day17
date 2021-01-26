package com.day17zuoye.work4;

public class MyRun implements Runnable{
    private  Meng meng=new Meng();

    public MyRun() {
    }

    public MyRun(Meng meng) {
        this.meng = meng;
    }

    @Override
    public void run() {
        while (true) {
            if(meng.getNum()<=0) {
                System.out.println("不好意思，满座啦");
                break;
            }
            System.out.println("车为: " + meng.getName() + " 门为: " + Thread.currentThread().getName() + " 剩余座位" + meng.getNum());
            meng.setNum(meng.getNum() - 1);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
