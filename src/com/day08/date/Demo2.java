package com.day08.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) {
        Date date = new Date();   //小心包的类型  在导入的时候 // 创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat format =new SimpleDateFormat("yyyy年MM月dd日 HH:mm;ss");//HH为24小时制
        String str =format.format(date);
        System.out.println(str);
        //
    }
}
