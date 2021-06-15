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
    private SupplierService supplierService;

    Map<String, List<Supplier>> suppliers = new HashMap<>();
    List<Product> products = new ArrayList<>();

    public Product add(String name, String qtd) {
        Integer quantity = Integer.valueOf(qtd);
        products.add(new Product(name, quantity));
        return products.get(products.size() - 1);
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

    public List<Stock> addSupplierIntoProduct(Integer idProduct, Integer idSupplier, Integer qtd) {
        Product product = products.get(idProduct);
        Supplier supplier = supplierService.getById(idSupplier);
        Stock stockItem = new Stock(supplier, qtd);
        List<Stock> list = product.getStock();
        list.add(stockItem);
        return list;
    }

    public Product getSuppliersByProduct(Integer id) {
        return products.get(id);
    }

}
