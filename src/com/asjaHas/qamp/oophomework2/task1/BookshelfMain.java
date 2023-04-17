package com.asjaHas.qamp.oophomework2.task1;

public class BookshelfMain {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        Book book1 = new Book("Jezeva kucica", 9789535000563L, "Branko Copic");
        Book book2 = new Book("Aska i vuk", 9789535000564L, "Ivo Andric");

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.printBookshelf();
        System.out.println("Bookshelf contains book with ISBN 9789535000563: " + bookshelf.containsBook(9789535000563L));
    }
}

