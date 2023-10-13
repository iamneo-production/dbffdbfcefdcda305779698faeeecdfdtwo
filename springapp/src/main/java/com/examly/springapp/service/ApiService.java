package com.examly.springapp.service;

import com.examly.springapp.model.Laptop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApiService {
    private final List<Laptop> laptops = new ArrayList<>();
        
            public boolean addLaptop(Laptop laptop) {
                    return laptops.add(laptop);
                        }
                            
            public Laptop getLaptopById(int laptopId) {
                for (Laptop laptop : laptops) {
                    if (laptop.getLaptopId() == laptopId) {
                        return laptop;
                    }
               }
            return null; // Return null if laptop is not found
         }
                                                                                                        
        public List<Laptop> getAllLaptops() {
             return laptops;
                 
            }
 }
