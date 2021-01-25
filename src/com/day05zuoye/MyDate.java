package com.day05zuoye;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void showDate() {      //这些是方法 方法是可以继承的 而构造函数不可以继承  构造函数的作用及意义 就是初始化作用
        System.out.println("打印日期:" + "显示" + year + "年" + month + "月" + day + "日");
    }

    public void isBi() {
        if ((this.year % 100 != 0 && year % 4 == 0) || (year % 400 == 0 && year%100 == 0)) {
            System.out.println(year+ "是闰年");
        }else{
            System.out.println(year+ "不是闰年");
        }
    }
}