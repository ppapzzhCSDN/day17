package com.day17zuoye.work5;

import java.util.concurrent.Callable;

public class MyRun implements Callable {
    private Integer num;

    public MyRun() {
    }

    public MyRun(Integer num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int count=1;
        for (int i = 1; i <=num ; i++) {
            count=count*i;
        }
        return count;
    }
}
