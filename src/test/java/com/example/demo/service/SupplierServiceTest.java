package com.example.demo.service;

import com.example.demo.model.Supplier;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SupplierServiceTest {

    @Autowired
    private SupplierService service;

    List<Supplier> suppliers = new ArrayList<>();

    void deleteAll() {
        for (Supplier item: suppliers
        ) {
            service.delete(suppliers.indexOf(item));
        }
    }

    @Test
    @DisplayName("Supplier list null/empty")
    void getAllEmpty() {
        deleteAll();
        Assertions.assertEquals(new ArrayList<>(), service.getAll());
    }

    @Test
    @DisplayName("Add supplier success")
    void add() {
        Supplier supplier = service.add("JORGE");
        Assertions.assertEquals("JORGE", supplier.getName());
    }

    @Test
    @DisplayName("Supplier get list success")
    void getAllSuccess() {
        deleteAll();
        List<Supplier> suppliers = new ArrayList<>();
        Supplier j = service.add("JORGE");
        Supplier m = service.add("MARIANA");
        suppliers.add(j);
        suppliers.add(m);
        Assertions.assertEquals(2, service.getAll().size());
    }


    @Test
    void getById() {
        deleteAll();
        Supplier m = service.add("MARIANA");
        Assertions.assertEquals("MARIANA", service.getById(0).getName());
    }

}