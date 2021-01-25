package com.day16.zuoye;

import com.day16.file;

import java.io.FileReader;
import java.io.FileWriter;

public class Work5 {
    public static void main(String[] args)throws Exception {
        long start =System.currentTimeMillis();
        FileReader fr=new FileReader("D:\\c3p0-0.9.5.2.jar");
        FileWriter fw =new FileWriter("D:\\a\\c3p0-0.9.5.2.jar");
        int b;
        while ((b = fr.read()) != -1){
            fw.write(b);
        }
        fw.close();
        fr.close();
        long end =System.currentTimeMillis();
        System.out.println(end-start);
    }
}
