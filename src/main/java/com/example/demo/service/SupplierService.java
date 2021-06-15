package com.example.demo.service;

import com.example.demo.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierService {

    List<Supplier> suppliers = new ArrayList<>();

    public List<Supplier> getAll() {
        return suppliers;
    }

    public Supplier add(String name){
     suppliers.add(new Supplier(name));
        return suppliers.get(suppliers.size()-1);
    }

    public Supplier getById(Integer id) {
        return suppliers.get(id);
    }

    public List<Supplier> delete(Integer id) {
        suppliers.remove(suppliers.get(id));
        return suppliers;
    }

}
