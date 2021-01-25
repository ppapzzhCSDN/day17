package com.day10zuoye;

import java.util.ArrayList;

public class work1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        String arr[] = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }
}
