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

    @GetMapping("/times")
    public List<Supplier> listTeams(@RequestBody Map<String, String> json) {
           return tService.getAll();
    }

    @PostMapping("/times")
    public String createTeam(@RequestBody Map<String, String> json) {
        return tService.add(json.get("name"));
    }

    @GetMapping("/times/{id}")
    public Supplier getTeamById(@PathVariable Integer id) {
        return tService.getById(id);
    }

    @DeleteMapping("/times/{id}")
    public List<Supplier> deleteTeam(@PathVariable Integer id) {
        return tService.delete(id);
    }

}
