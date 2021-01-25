package com.day9zuoye.work8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
//        System.out.println("你QQ注册的时间 格式 YYYY-MM-dd " );

//        String registerDate = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy年MM月dd日");
        String str1="2013年6月8日";
        Date registerDate =sdf.parse(str1);
        System.out.println(registerDate);
        String str2="2015年9月1日";
        String str3="2016年3月3日";
        Date dateNow=new Date();
        Date str1Date=sdf.parse(str1);
        Date str2Date=sdf.parse(str2);
        Date str3Date=sdf.parse(str3);
        long timeAll =dateNow.getTime()-str3Date.getTime()+(str2Date.getTime()-str1Date.getTime());
        System.out.println(timeAll);
        long activeDay =timeAll/100/60/60/24;
        System.out.println(activeDay);
        double N=(-4+Math.sqrt(4*4+4*activeDay))/2d;
        System.out.println(N);

    }
}
