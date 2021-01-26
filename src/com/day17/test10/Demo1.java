package com.day17.test10;

import java.util.concurrent.locks.ReentrantLock;

public class Demo1 implements Runnable{
    private Integer num=100;
    ReentrantLock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true) {
            lock.lock();            //不能放外面
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("票卖完啦");
                    lock.unlock();
                    break;
                }
                System.out.println("窗口号" + Thread.currentThread().getName() + "票号" + num);
                 num--;
                lock.unlock();
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
