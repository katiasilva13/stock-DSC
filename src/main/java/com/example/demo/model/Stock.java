package com.example.demo.model;

public class Stock {

    Supplier supplier = new Supplier();
    Integer quantity;
    String reference;

    public Stock() {
    }

    public Stock(Supplier supplier, Integer quantity, String reference) {
        this.supplier = supplier;
        this.quantity = quantity;
        this.reference = reference;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}

