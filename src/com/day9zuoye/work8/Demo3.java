package com.day9zuoye.work8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws ParseException {

        String sourcedate = "2013-6-8";
        String stopstartdate = "2015-9-1";
        String stopstoptdate = "2016-3-3";
        long nowtime = System.currentTimeMillis();  //1611022327830
//        System.out.println(nowtime);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date1 = dateFormat.parse(sourcedate);
        Date date2 = dateFormat.parse(stopstartdate);
        Date date3 = dateFormat.parse(stopstoptdate);
        long date1Time= date1.getTime();
        System.out.println(date1Time);
        long date2Time= date2.getTime();
        long date3Time= date3.getTime();
        int day =(int)((nowtime-(date3Time-date2Time)-date1Time)/(1000*60*60*24));
        int level = (int)(-(4-Math.sqrt(16+4*day))/(2));
        System.out.println("注册天数为:"+day+" QQ等级是:"+level);

    }
}
