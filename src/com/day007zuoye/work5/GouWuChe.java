//package com.day007zuoye.Work5;
//
//import java.util.ArrayList;
//
//public class GouWuChe {
//    ArrayList list = new ArrayList();//在购物车类GouWuChe中定义ArrayList成员变量,用于保存购物车中的商品
//    public GouWuChe(){
//    }
//    public void addGood(Goods goods){
//        System.out.println("加入 " + goods.getName() + " 成功");
//        list.add(goods);
//    }public void showGoods(){
//        System.out.println("您选购的商品为:");
//        for (int i = 0; i < list.size(); i++) {
//            Goods goods = (Goods) list.get(i);System.out.println("\t" + goods.getId() + "," + goods.getName() + ",goods.getPrice());
//            public void total() {
//                double off = 0; // 折扣价
//                double sum = 0; // 原价
//                for (int i = 0; i < list.size(); i++) {
//                    Goods goods = list.get(i);
//                    double price = goods.getPrice();
//                    sum += price;
//// 如果商品为电子产品,就打折计算
//                    if (goods instanceof EGoods) {
//                        price *= 0.88;
//                    }
//                    off += price;
//                }
//                System.out.println("‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐‐");
//                System.out.println("原 价为:" + sum + " 元");
//                System.out.println("折后价为:" + off + " 元");
//            }
//        }
//    }
//}
