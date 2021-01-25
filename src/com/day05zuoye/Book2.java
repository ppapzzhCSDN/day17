package com.day05zuoye;

public class Book2 {
    public static void main(String[] args) {

//        Book book = new Book(0003, "红楼梦", 10089, 129, 2012);
        Book book1 = new Book(0001, "西游记", 10086, 120, 2009);
        Book book2 = new Book(0002, "水浒传", 10087, 130, 2021);
        Book book3 = new Book(0003, "红楼梦", 10089, 129, 2012);
        Book[] maxPrice = {book1, book2, book3};
        int max = book1.getPrice() > book2.getPrice() ? book1.getPrice() : book2.getPrice() > book3.getPrice() ? book1.getPrice() > book2.getPrice() ? book1.getPrice() : book2.getPrice() : book3.getPrice();
        for (int i = 0; i < maxPrice.length; i++) {
            if (maxPrice[i].getPrice() == max) {
//                System.out.println("最贵的书是 :" + maxPrice[i].getBianhao() + "书名" + maxPrice[i].Book() + "IBSN编号" + maxPrice[i].getISBN() + "价格" + maxPrice[i].getPrice() + "出版时期是" + maxPrice[i].getDate());
            }

        }
    }
}