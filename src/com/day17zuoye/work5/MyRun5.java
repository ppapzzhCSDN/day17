package com.day17zuoye.work5;

public class MyRun5 implements Runnable{  //你一头就不是对的
    private Yunsuan yunsuan;

    public MyRun5() {
    }

    public MyRun5(Yunsuan yunsuan) {
        this.yunsuan = yunsuan;
    }

    @Override
    public void run() {
        while (true){
            synchronized (yunsuan){
                if(yunsuan.getNum()<=1){
                    System.out.println("阶乘完成啦");
                    break;
                }


            }
        }
    }
}
