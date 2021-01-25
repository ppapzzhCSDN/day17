package com.day10.day010;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo11 {
    public static void main(String[] args) {
        HashMap<String,String>map=new HashMap<String, String>();
        map.put("胡歌", "霍建华");
        map.put("郭德纲", "于谦");
        map.put("薛之谦", "大张伟");
        Set<Map.Entry<String,String>>entrySet =map.entrySet();
        for (Map.Entry<String,String>entry:entrySet){
            String key =entry.getKey();
            String value=entry.getValue();
            System.out.println(key+"和"+value);
        }
    }
}
