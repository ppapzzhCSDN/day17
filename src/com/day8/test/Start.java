package com.day8.test;

public class Start {
    private Task task;   //定义一个Start启动类，内部包含一个任务Task
    public void Start(Task task){
        this.task=task;
    }
    public void eat(){
        System.out.println("今天又跑步吗？？");
        //执行task文件
        task.task();
    }
}
