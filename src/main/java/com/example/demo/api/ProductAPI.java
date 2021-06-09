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
    private ProductService cService;

    @GetMapping("/campeonatos")
    public List<Product> listCamps(@RequestBody Map<String, String> json) {
        return cService.getAll();
    }

//    @PostMapping("/campeonatos")
//    public String createCamp(@RequestBody Map<String, String> json) {
//        return cService.add(json.get("name"), json.get("startDate"), json.get("endDate"));
//    }

    @GetMapping("/campeonatos/{id}")
    public Product getCampById(@PathVariable Integer id) {
        return cService.getById(id);
    }

    @DeleteMapping("/campeonatos/{id}")
    public List<Product> deleteCamp(@PathVariable Integer id) {
        return cService.delete(id);
    }

    @PostMapping("/campeonatos/times")
    public List<Product> addTeamInCamp(@RequestBody Map<String, Integer> json) {
        return cService.addSupplierIntoProduct(json.get("idCamp"), json.get("idTeam"), json.get("pontos"));
    }

    @GetMapping("/campeonatos/times/{id}")
    public Product getTeamsByCamp(@PathVariable Integer id) {
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
