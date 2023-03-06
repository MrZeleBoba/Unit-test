package org.example;

import java.time.LocalDate;

public class Books {
    private String title;
    private Author nameAuthor;
    private int yearWrit;
    private int rating;
    private String text;

    public Books(String title, Author nameAuthor, int yearWrit, String text) {
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.yearWrit = LocalDate.now().getYear();
        this.rating = 3;
        this.text = text;
    }


    public String toString() {
        return "" + title + " {" + nameAuthor + "} (" + yearWrit + " Год) (" + rating + ") " + text + "";
    }

    public void up() {
        if (rating < 5) {
            rating++;
        }


    }

    public void down() {
        if (rating > 0) {
            rating--;
        }
    }

    public void append(String moreText) {
        text += moreText;
    }

}
