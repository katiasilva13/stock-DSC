package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.Stock;
import com.example.demo.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    @Autowired
    private SupplierService tService;

    Map<String, List<Supplier>> suppliers = new HashMap<>();
    List<Product> products = new ArrayList<>();

    public String add(String name, Float qtd) {
        products.add(new Product(name, qtd));
        return products.get(products.size() - 1).getName();
    }

    public List<Product> getAll() {
        return products;
    }

    public Product getById(Integer id) {
        return products.get(id);
    }

    public List<Product> delete(Integer id) {
        products.remove(products.get(id));
        return products;
    }

    public List<Product> addSupplierIntoProduct(Integer idProduct, Integer idSupplier, Integer qtd) {
        Product product = products.get(idProduct);
        Supplier supplier = tService.getById(idSupplier);
        Stock products = new Stock(supplier, qtd);
        List<Stock> list = product.getQuantityAvailable();
        list.add(products);
        return products;
    }

    public Product getSuppliersByProduct(Integer id) {
        return products.get(id);
    }

}
