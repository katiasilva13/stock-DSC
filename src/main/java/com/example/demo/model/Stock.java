package com.example.demo.model;

public class Stock {

    Supplier supplier = new Supplier();
    Integer quantity;

    public Stock() {
    }

    public Stock(Supplier supplier, Integer quantity) {
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

}

