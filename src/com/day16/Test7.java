package com.day16;

import java.io.FileReader;
import java.io.FileWriter;

public class Test7 {
    public static void main(String[] args)throws Exception {
        FileReader fr =new FileReader("D:\\下载目录\\Navicat12x64.zip");
        FileWriter fw =new FileWriter("D:\\迅雷下载\\Navicat12x64.zip");

        char[] c = new char[1024];
        int len;
        while ((len=fr.read(c))!=-1){
            fw.write(c,0,len);
        }
        fw.close();
        fr.close();
    }
}
