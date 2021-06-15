package com.example.demo.api;

import com.example.demo.model.Product;
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
    public List<Product> addSupplierIntoProduct(@RequestBody Map<String, Integer> json) {
        return service.addSupplierIntoProduct(json.get("idProduct"), 
        json.get("idSupplier"), json.get("qtd"));
    }

    @GetMapping("/products/{id}/Suppliers")
    public Product getSuppliersByProduct(@PathVariable Integer id) {
        return cService.getSuppliersByProduct(id);
    }

//    @DeleteMapping("/campeonatos/times/{idCamp}/{idPositionTeam}")
//    public Product deleteTeam(@PathVariable Integer idCamp, @PathVariable Integer idPositionTeam) {
//        return cService.removeSupplierFromProduct(idCamp, idPositionTeam);
//    }
//
//    @GetMapping("/campeonatos/ranking/{id}")
//    public Product getRankByCamp(@PathVariable Integer id) {
//        return cService.getRankByProduct(id);
//    }

}
