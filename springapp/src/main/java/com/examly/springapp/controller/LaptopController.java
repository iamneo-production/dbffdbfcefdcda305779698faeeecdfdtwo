package com.examly.springapp.controller;

import com.examly.springapp.model.Laptop;
import com.examly.springapp.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class LaptopController {
    private final ApiService apiService;

        @Autowired
            public LaptopController(ApiService apiService) {
                    this.apiService = apiService;
                    }

        @GetMapping("/{laptopId}")
            public Laptop getLaptop(@PathVariable int laptopId) {
                    return apiService.getLaptopById(laptopId);
                    }

        @GetMapping("/")
            public List<Laptop> getLaptops() {
                return apiService.getAllLaptops();
                    }

        @PostMapping("/")
        public boolean addLaptop(@RequestBody Laptop laptop) {
                return apiService.addLaptop(laptop);
                    }
        }
