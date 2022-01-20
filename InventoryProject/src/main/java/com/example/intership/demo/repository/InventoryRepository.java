package com.example.intership.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.intership.demo.model.Inventory;
public interface InventoryRepository extends JpaRepository<Inventory,Integer>{
    
}
