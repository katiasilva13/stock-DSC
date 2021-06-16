package com.example.demo.service;

import com.example.demo.model.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SupplierServiceTest {

    @Autowired
    private SupplierService service;

    @Test
    void deleteAll() {
        List<Supplier> suppliers = service.getAll();
        for (Supplier item: suppliers
        ) {
            service.delete(suppliers.indexOf(item));
        }
        Assertions.assertEquals(0, service.getAll().size());
    }

    @Test
    @DisplayName("Supplier list null/empty")
    void getAllEmpty() {
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
        service.add("JORGE");
        service.add("MARIANA");
        Assertions.assertEquals(2, service.getAll().size());
    }


    @Test
    void getById() {
        service.add("MARIANA");
        Assertions.assertEquals("MARIANA", service.getById(0).getName());
    }

}