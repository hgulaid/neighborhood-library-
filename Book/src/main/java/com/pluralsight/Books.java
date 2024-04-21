package com.pluralsight;

public class Books {
    private int bookId;
    private  String bookIsbn;
    private  String title;
    private  boolean checkOut;
    private  String checkOutTo;

    public Books (int bookId, String bookIsbn, String title, boolean checkOut, String checkOutTo){
        this.bookId = bookId;
        this.bookIsbn = bookIsbn;
        this.title = title;
        this.checkOut = checkOut;
        this.checkOutTo = checkOutTo;
    }
public int getBookId() {return bookId;}
public void setBookId(int bookId) {this.bookId = bookId;}
public String getBookIsbn (){return bookIsbn;}
public void setBookIsbn(String bookIsbn){this.bookIsbn = bookIsbn;}
public String getTitle(){return title;}
public void setTitle(String title) {this.title = title;}
public boolean getCheckOut() {return checkOut;}
public void setCheckOut(boolean checkOut) {this.checkOut = checkOut;}
public String getCheckOutTo() {return checkOutTo;}
public void setCheckOutTo(String checkOutTo) {this.checkOutTo = checkOutTo;}















    }
