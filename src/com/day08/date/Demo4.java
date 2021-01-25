package com.day08.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) throws Exception {
        System.out.println("请输出你的生日: 格式 YYYY-MM-dd"  );
        String stringbirthday = new Scanner(System.in).nextLine();
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(stringbirthday);
        Date todayDate = new Date();
        long birthdaySecond = birthdayDate.getTime();
        long todaySecond =todayDate.getTime();
        long second = todaySecond-birthdaySecond;
        if(second <0){
            System.out.println("还没出生");
        }else {
            System.out.println(second/1000/60/60/24);
        }

    }

}
