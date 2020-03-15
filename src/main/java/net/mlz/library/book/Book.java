package net.mlz.library.book;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String author;
    private String title;
    private String year;

    public String toString() { return " { Book ["+id+"] "+author+" - "+title+" "+year+" } "; }

    public Book() { } 

    public Book(String a, String t, String y) {
        author=a; title=t; year=y;
    }

    public void copy(Book b) {
        author=b.author;
        title=b.title;
        year=b.year;
    }

}

