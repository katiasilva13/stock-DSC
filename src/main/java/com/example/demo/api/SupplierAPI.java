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
    private SupplierService tService;

    @GetMapping("/suppliers")
    public List<Supplier> getAll(@RequestBody Map<String, String> json) {
           return tService.getAll();
    }

    @PostMapping("/suppliers")
    public String add(@RequestBody Map<String, String> json) {
        return tService.add(json.get("name"));
    }

    @GetMapping("/suppliers/{id}")
    public Supplier getById(@PathVariable Integer id) {
        return tService.getById(id);
    }

    @DeleteMapping("/suppliers/{id}")
    public List<Supplier> delete(@PathVariable Integer id) {
        return tService.delete(id);
    }

}
