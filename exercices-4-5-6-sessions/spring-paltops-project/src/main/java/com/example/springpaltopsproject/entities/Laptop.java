package com.example.springpaltopsproject.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String branch;
    private double price;

    public Laptop() {
    }

    public Laptop(Long id, String branch, double price) {
        this.id = id;
        this.branch = branch;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
