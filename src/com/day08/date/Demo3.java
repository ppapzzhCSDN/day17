package com.day08.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//关于parse解析
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str ="2018年12月11日";
        Date date =df.parse(str);
        System.out.println(date);

    }
}