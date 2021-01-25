package com.day10zuoye;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class work2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("亲输出你的字符：");
        String str =scanner.nextLine();
        char[] chars= str.toCharArray();
        HashSet<Character> set =new HashSet();
        for (char chars1:chars) {
                set.add(chars1);
        }
        ArrayList<Character> list =new ArrayList<>();
        for (Character cc:set){
            list.add(cc);
        }
        System.out.println(list);


    }


}
