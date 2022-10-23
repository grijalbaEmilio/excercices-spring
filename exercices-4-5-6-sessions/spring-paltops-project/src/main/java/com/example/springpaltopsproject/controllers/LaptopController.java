package com.example.springpaltopsproject.controllers;

import com.example.springpaltopsproject.entities.Laptop;
import com.example.springpaltopsproject.reposirories.LaptopRepository;
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

}
