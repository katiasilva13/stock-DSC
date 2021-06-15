package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.Stock;
import com.example.demo.model.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ProductServiceTest {

    @Autowired
    private ProductService service;
    @Autowired
    private SupplierService supplierService;

    @Test
    void deleteAll() {
        List<Product> products = service.getAll();
        for (Product item: products
        ) {
            service.delete(products.indexOf(item));
        }
        Assertions.assertEquals(0, service.getAll().size());
    }

    @Test
    void add() {
        Product product = service.add("AMORA", "25");
        Assertions.assertNotEquals("JORGE", product.getName());
    }

    @Test
    @DisplayName("Product get list success")
    void getAllSuccess() {
        service.add("AMORA", "25");
        service.add("LARANJA", "50");
        Assertions.assertEquals(2, service.getAll().size());
    }

    @Test
    void getById() {
        service.add("AMORA", "25");
        Assertions.assertEquals("AMORA", service.getById(0).getName());
    }
    @Test
    @DisplayName("Product list null/empty")
    void getAllEmpty() {
        Assertions.assertEquals(new ArrayList<>(), service.getAll());
    }

    @Test
    void addSupplierIntoProduct() {
        Product product = service.add("AMORA", "25");
        Supplier supplier = supplierService.add("JORGE");
        Stock stockItem = new Stock(supplier, 3);
        List<Stock> list = product.getStock();
        list.add(stockItem);
    }

    @Test
    void getSuppliersByProduct() {
    }
}