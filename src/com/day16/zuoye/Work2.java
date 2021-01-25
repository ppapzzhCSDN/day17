package com.day16.zuoye;

import java.io.File;
import java.util.*;

public class Work2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入你的盘符");
        String str= scanner.next();
        File file =new File(str);
        String[] dir = file.list();
        int a=0;
        int b=0;
        int c=0;
        for (int i = 0; i <dir.length ; i++) {
            if (dir[i].endsWith("doc")) {
                a++;
            }if (dir[i].endsWith("java")){
                b++;
            }if(dir[i].endsWith("txt")){
                c++;
            }
        }
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("doc",a);
        map.put("java",b);
        map.put("txt",c);
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        for(Map.Entry<String, Integer> entry:entrySet){
//            String key =entry.getKey();
//            Integer value= entry.getValue();
//            System.out.println(key +"的文件个数是"+ value);
//        }
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        while (it.hasNext()){
            String s =it.next();
            System.out.println(s+"的文件个数是" +map.get(s));
        }
    }
}
