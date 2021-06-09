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

    public List<Product> addSupplierIntoProduct(Integer idCamp, Integer idTeam, Integer pontos) {
        Product camp = products.get(idCamp);
        Supplier time = tService.getById(idTeam);
//        Stock p = new Stock(time, pontos);
//        List<Stock> lista = camp.getPontuacao();
//        lista.add(p);
        return products;
    }

    public Product getSuppliersByProduct(Integer id) {
        return products.get(id);
    }

//    public Product getRankByProduct(Integer id) {
//        Product camp = products.get(id);
//        List<Stock> lista = camp.getPontuacao();
//        lista.sort(Comparator.comparing(Stock::getQuantity).reversed());
//        return products.get(id);
//    }

//    public Product removeSupplierFromProduct(Integer id, Integer idPositionTeam) {
//        Product camp = products.get(id);
//        List<Stock> lista = camp.getPontuacao();
//        Stock p = new Stock();
//        p = lista.get(idPositionTeam);
//        lista.remove(p);
//        return products.get(id);
//    }

}
