package com.day16.zuoye;

import java.io.FileReader;

public class Work6 {
    public static void main(String[] args) throws Exception{
        FileReader fr =new FileReader("D:\\a\\b.txt");
        int b;
        while ((b=fr.read())!=-1){
            System.out.print((char)b);
        }
        fr.close();
    }
}
