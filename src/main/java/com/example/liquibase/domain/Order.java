package com.example.liquibase.domain;

import liquibase.pro.packaged.R;

import javax.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(nullable = false, length = 100)
    String title;

    @Column(nullable = false)
    String text;

    @ManyToOne
    Restaurant restaurant;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Restaurant getAuthor() {
        return restaurant;
    }

    public void setAuthor(Restaurant author) {
        this.restaurant = author;
    }
}
