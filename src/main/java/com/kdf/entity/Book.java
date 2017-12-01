package com.kdf.entity;

import java.util.Date;

/**
 * created  by KDF on 2017/11/23.
 */


public class Book {
    int id;
    String title;
    String description;
    Date pub_time;
    String author;

//    public Book( String title, String description, String pub_time, String author) {
//
//        this.title = title;
//        this.description = description;
//        this.pub_time = pub_time;
//        this.author = author;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPub_time() {
        return pub_time;
    }

    public void setPub_time(Date pub_time) {
        this.pub_time = pub_time;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
