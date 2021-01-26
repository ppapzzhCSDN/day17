package com.day17zuoye.work2;

import com.day007zuoye.work1.B;

public class Shandong implements Runnable{
    private Integer num=10;
    private Object obj =new Object();

    public Shandong(Object obj) {
    }

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(num<=0){
                    System.out.println("全部人通过山洞啦");
                    break;
                }
                System.out.println("姓名为 "+Thread.currentThread().getName()+" 通过山洞"+  " 编号为"+num);
                num--;
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
