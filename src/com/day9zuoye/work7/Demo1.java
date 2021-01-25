package com.day9zuoye.work7;

public class Demo1 {
    public static void main(String[] args) {
        String str = "javajfifiewjavajfifiowfjavagkljjava";
        int count1 = getCount(str, "java");
        System.out.println("字符串java的数量:"+count1);
    }

    public static int getCount(String str, String ch) {
        int count =0;
        while (str.indexOf(ch) !=-1){   //// 说明查找到了字符串ch
            int index =str.indexOf(ch);
            str=str.substring(index+ch.length());
            count++;
        }
        return count;
//        or (int i = 0; i <str.length() ; i++) ;
////
//    }f
    }

    }