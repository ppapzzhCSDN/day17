package com.day10.test4;

import com.day007zuoye.work1.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<String> cards = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        colors.add("♥");
        colors.add("♦");
        colors.add("の");
        colors.add("♣");
        for (int i = 2; i <= 10; i++) {
            numbers.add(i + "");
        }
        numbers.add("1");
        numbers.add("K");
        numbers.add("O");
        numbers.add("J");
        ArrayList<String> play1 = null;
        ArrayList<String> play3 = null;
        ArrayList<String> play2 = null;
        ArrayList<String> dipai = null;
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < colors.size(); j++) {
                cards.add(numbers.get(i) + numbers.get(j));
            }
            cards.add("大王");
            cards.add("小王");
            Collections.shuffle(cards);
            play1 = new ArrayList<>();
            play2 = new ArrayList<>();
            play3 = new ArrayList<>();
            dipai = new ArrayList<>();
            for (int k = 0; k < 54; k++) {
                for (i = 0; i < 54; i++)
                    if (i > 50) {
                        dipai.add(cards.get(i));
                    } else {
                        if (i % 3 == 0) {
                            play1.add(cards.get(i));
                        } else if (i % 3 == 1) {
                            play2.add(cards.get(i));
                        } else {
                            play3.add(cards.get(i));
                        }
                    }


                System.out.println("西门庆" + play1);
                System.out.println("武大郎" + play3);
                System.out.println("潘金莲" + play2);
                System.out.println("底牌" + dipai);
            }
        }
    }
}