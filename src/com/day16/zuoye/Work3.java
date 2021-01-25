package com.day16.zuoye;

import java.io.*;

public class Work3 {
    public static void main(String[] args) {
        File file = new File("D:\\a\\a.txt");
        getNumber(file,'a');
    }
    public static void getNumber(File file, char ch) {
        if (file.isFile() && file.length() != 0) {
            try (Reader in = new FileReader(file)) {
                int c =0;
                int count =0;
                while ((c = in.read()) != -1) {
                    if ((char) c == ch) {
                        count ++;
                    }
                }
                System.out.println(ch+"在文件中共出现了"+count+"次");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            System.out.println("文件不合法");
        }
    }
}

