package com.example.demo.service;

import com.example.demo.model.Supplier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SupplierService {

    List<Supplier> times = new ArrayList<>();

    public List<Supplier> getAll() {
        return times;
    }

//    public String add(String nome){
//        times.add(new Supplier(nome));
//        return times.get(times.size()-1).getName();
//    }

    public Supplier getById(Integer id) {
        return times.get(id);
    }

    public List<Supplier> delete(Integer id) {
        times.remove(times.get(id));
        return times;
    }

}
