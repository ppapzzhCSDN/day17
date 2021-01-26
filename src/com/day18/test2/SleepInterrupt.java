package com.day18.test2;

import org.junit.rules.Timeout;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class SleepInterrupt implements Runnable {
        @Override
        public void run () {
            for (int i = 0; i < 10; i++) {
                System.out.println(new Date());
            }
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                System.out.println("被中断了");
                e.printStackTrace();
            }
        }

    }