package org.example;

import java.time.LocalDate;

public class Author {
    private String name;
    private String secName;
    private int numBooks;

    public Author(String name, String secName, int numBooks) {
        this.name = name;
        this.secName = secName;
        this.numBooks = 0;
    }

    public String toString() {
        return "" + name + " " + secName + "";
    }

    public Books newBooks(String title) {
        Books books = new Books(title, this, LocalDate.now().getYear(), " ");
        return books;
    }
}
