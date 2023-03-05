package org.example;

import java.time.LocalDate;

public class Books {
    public String title;
    public Author nameAuthor;
    public int yearWrit;
    public int rating;
    public String text;

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
