package com.example.springpaltopsproject.controllers;

import com.example.springpaltopsproject.entities.Laptop;
import com.example.springpaltopsproject.reposirories.LaptopRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController  {
    LaptopRepository laptopRepository;

    public LaptopController(LaptopRepository laptopRepository){
        this.laptopRepository = laptopRepository;
    }

    @PostMapping("/api/laptops")
    public Laptop add(@RequestBody Laptop laptop){
        return laptopRepository.save(laptop);
    }

    @GetMapping("/api/laptops")
    public List<Laptop> findAll(){
        return laptopRepository.findAll();
    }

    @GetMapping("/api/laptops/{id}")
    public Laptop findById(@PathVariable Long id){
        return laptopRepository.findById(id).get();
    }

    @PutMapping("/api/laptops")
    public ResponseEntity<Laptop> update(@RequestBody Laptop laptop){
        System.out.println(laptop.getId());
        if(laptop.getId() == null) return ResponseEntity.badRequest().build();

        if(laptopRepository.findById(laptop.getId()) == null) return ResponseEntity.notFound().build();

        Laptop laptopUpdate = laptopRepository.save(laptop);

        return ResponseEntity.ok(laptopUpdate);
    }

    @DeleteMapping("/api/laptops/{id}")
    public ResponseEntity<Laptop> delete(@PathVariable Long id){
        if(laptopRepository.findById(id) == null)return ResponseEntity.notFound().build();

        laptopRepository.deleteById(id);

        return ResponseEntity.status(200).build();
    }

    @DeleteMapping("/api/laptops")
    public ResponseEntity<Laptop> deleteAll(){
        if(laptopRepository.findAll().size() == 0) return ResponseEntity.noContent().build();

        laptopRepository.deleteAll();

        return ResponseEntity.status(200).build();
    }

}
