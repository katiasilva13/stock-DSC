package com.example.demo.api;

import com.example.demo.model.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.SupplierService;

import java.util.List;
import java.util.Map;

@RestController
public class SupplierAPI {

    @Autowired
    private SupplierService service;

    @GetMapping("/suppliers")
    public List<Supplier> getAll(@RequestBody Map<String, String> json) {
           return service.getAll();
    }

    @PostMapping("/suppliers")
    public Supplier add(@RequestBody Map<String, String> json) {
        return service.add(json.get("name"));
    }

    @GetMapping("/suppliers/{id}")
    public Supplier getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/suppliers/{id}")
    public List<Supplier> delete(@PathVariable Integer id) {
        return service.delete(id);
    }

}
