package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Product {
    String name;
    Integer quantityAvailable;

    List<Stock> stock = new ArrayList<>();

    public Product() {
    }

    public Product(String name, Integer quantityAvailable) {
        this.name = name;
        this.quantityAvailable = quantityAvailable;
    }

    public Product(String name, Integer quantityAvailable, List<Stock> stock) {
        this.name = name;
        this.quantityAvailable = quantityAvailable;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setQuantityAvailable(Integer quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public List<Stock> getStock() {
        return stock;
    }

    public void setStock(List<Stock> stock) {
        this.stock = stock;
    }
}
