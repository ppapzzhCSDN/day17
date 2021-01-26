package com.day17.test3;

import java.util.concurrent.Callable;

public class Mycoll implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("线程当前ID:"+Thread.currentThread().getId());
        System.out.println("线程当前名字"+Thread.currentThread().getName());
        return "伟健哥哥";
    }
}
