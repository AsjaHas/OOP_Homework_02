package com.asjaHas.qamp.oophomework2.task1;

public class Book {
    private String title;
    private long ISBN;
    private String author;

    public Book(String title, long ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public long getISBN() {
        return ISBN;
    }

    public String toString() {
        return title + ", " + author + " (" + ISBN + ")";
    }
}
