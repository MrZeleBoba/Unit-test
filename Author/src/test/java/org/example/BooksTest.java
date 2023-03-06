package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    private Author nameAuthor;
    private Books books;

    @BeforeEach
    public void bookTest() {
        this.nameAuthor = new Author("Лев", "Толстой", 0);
        this.books = new Books("Война и Мир", nameAuthor, LocalDate.now().getYear(), " ");
    }

    @Test
    void upRatingTestLimitTest() {
        Books actualBooks = books;
        actualBooks.up();
        actualBooks.up();
        actualBooks.up();
        assertEquals(books, actualBooks);

    }

    @Test
    void downRatingTestLimitTest() {
        Books actualBooks = books;
        actualBooks.down();
        actualBooks.down();
        actualBooks.down();
        actualBooks.down();
        assertEquals(books, actualBooks);
    }

    @Test
    void append() {
        Books actualBooks = books;
        actualBooks.append("$$$$$$");
        assertEquals(books, actualBooks);
    }
}