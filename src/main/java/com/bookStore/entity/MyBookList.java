package com.bookStore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myBooks")
public class MyBookList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private int bookId;
    private String name;
    private String author;
    private String price;

    public MyBookList(int id, int bookId, String name, String author, String price) {
        this.id = id;
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public MyBookList(){
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    
    
}
