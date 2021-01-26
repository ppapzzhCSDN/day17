package com.day17zuoye.work3;

public class Dian implements Runnable {
    private Object obj = new Object();
    Integer num = 100;
    int shiti=0;
    int guangwang =0;
    public Dian(Object obj) {
    }
    public Dian(Object obj, Integer num) {
        this.obj = obj;
        this.num = num;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("卖完啦");
                    if(("实体店").equals(Thread.currentThread().getName())){    //Thread可能为空 所以放后面
                        shiti++;
                        System.out.println("实体店卖了：" + shiti);
                    }
                    guangwang++;
                    System.out.println("官网卖了：" + guangwang);
                    break;
                }
                System.out.println("店名为：" + Thread.currentThread().getName() + " 剩余水杯" + num);
                num--;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
