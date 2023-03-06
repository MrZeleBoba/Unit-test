package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    private Books books;
    private Books actual;


    @Test
    void newBooksCreateTest() {
        Books books = new Books("Три мушкетёра", new Author("Александр", "Дюма", 1), LocalDate.now().getYear(), " ");
        actual = books;
        assertEquals(books, actual);

    }
}