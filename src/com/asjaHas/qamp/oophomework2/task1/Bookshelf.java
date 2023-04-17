package com.asjaHas.qamp.oophomework2.task1;

import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private final List<Book> bookList;

    public Bookshelf() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean containsBook(String title) {
        for (Book book : bookList) {
            if (book.getTitle().equals(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsBook(long ISBN) {
        for (Book book : bookList) {
            if (book.getISBN() == ISBN) {
                return true;
            }
        }
        return false;
    }

    public void printBookshelf() {
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }
}
