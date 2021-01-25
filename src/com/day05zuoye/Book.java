package com.day05zuoye;

public class Book{
    int bianhao;
    String book;
    int ISBN;
    int price;
    int date;

    public Book() {
    }

    public Book(int bianhao, String book, int ISBN, int price, int date) {
        this.bianhao = bianhao;
        this.book = book;
        this.ISBN = ISBN;
        this.price = price;
        this.date = date;
    }

    public int getBianhao() {
        return bianhao;
    }

    public void setBianhao(int bianhao) {
        this.bianhao = bianhao;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public void Book(){
        System.out.println("最贵的书是 :" +bianhao+"书名"+book+ "IBSN编号"+ISBN+ "价格"+price+"出版时期是"+date);
    }
    public void Book1(){
        System.out.println(bianhao+"书名"+book+ "IBSN编号"+ISBN+ "价格"+price+"出版时期是"+date);
    }
    public void Book2(){
        System.out.println(bianhao+"书名"+book+ "IBSN编号"+ISBN+ "价格"+price+"出版时期是"+date);
    }
    public void Book3(){
        System.out.println(bianhao+"书名"+book+ "IBSN编号"+ISBN+ "价格"+price+"出版时期是"+date);
    }
}



