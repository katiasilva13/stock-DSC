package com.example.demo.api;

import com.example.demo.model.Product;
import com.example.demo.model.Stock;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProductAPI {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> listCamps(@RequestBody Map<String, String> json) {
        return service.getAll();
    }

    @PostMapping("/products")
    public String add(@RequestBody Map<String, String> json) {
        return service.add(json.get("name"), json.get("qtd"));
    }

    @GetMapping("/products/{id}")
    public Product getById(@PathVariable Integer id) {
        return service.getById(id);
    }

    @DeleteMapping("/products/{id}")
    public List<Product> delete(@PathVariable Integer id) {
        return service.delete(id);
    }

    @PostMapping("/products/suppliers")
    public List<Stock> addSupplierIntoProduct(@RequestBody Map<String, Integer> json) {
        return service.addSupplierIntoProduct(json.get("idProduct"), 
        json.get("idSupplier"), json.get("qtd"));
    }

    @GetMapping("/products/{id}/suppliers")
    public Product getSuppliersByProduct(@PathVariable Integer id) {
        return service.getSuppliersByProduct(id);
    }


}
