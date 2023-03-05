package org.example;

import java.time.LocalDate;

public class Author {
    public String name;
    public String secName;
    public int numBooks;

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
