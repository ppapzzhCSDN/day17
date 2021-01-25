package com.day10.test6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashMap<String,String> map=new HashMap<String, String>();

        map.put("吕布","貂蝉");
        map.put("周瑜","小乔");
        map.put("孙策","大乔");
        map.put("刘备","孙尚香");
//        map.put("刘备","阿斗");//key不可以重复 否则覆盖上面重复
        map.put("","贾玲"); //key 可以不输出
        map.put(null,null);//key value可以同事为空
//        System.out.println(map);//{吕布=貂蝉, 刘备=孙尚香, 孙策=大乔, 周瑜=小乔}
        Set<String> keys = map.keySet();  //获取所有的值
        for(String kk:keys){   //kk就是键
            String value =map.get(kk);   //获取的是值
            System.out.println(kk+"老婆是==" +value);
        }


    }
}
