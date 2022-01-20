package com.example.intership.demo.controllers;
import java.util.Optional;

import com.example.intership.demo.model.Inventory;
import com.example.intership.demo.repository.InventoryRepository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class InventoryController {
    @Autowired 
    InventoryRepository inventoryRepository;
    @GetMapping("/get/all")
    public ResponseEntity<Object> getAllInventory(){
        return new ResponseEntity<>(inventoryRepository.findAll(),HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Object> getInventoryById(@PathVariable String id){
        Integer _id = Integer.valueOf(id);
        return new ResponseEntity<>(inventoryRepository.findById(_id),HttpStatus.OK);
    }
    @PostMapping("/creat")
    public ResponseEntity<Object> creatInventory(@RequestBody Inventory inventory){
        inventoryRepository.save(inventory);
        return new ResponseEntity<Object>("Inventory has been created successfully",HttpStatus.CREATED);
    }
    @PutMapping(value = "/addOrUpdate")
    public ResponseEntity<Object> addOrUpdatedInventory(@RequestBody Inventory inventory){
        Optional<Inventory> org = inventoryRepository.findById(inventory.getId());
        // If inventory can be find, update the infromation.
        if(!org.isPresent()){
            inventoryRepository.saveAndFlush(inventory);
            return new ResponseEntity<Object>("Inventory information has been updated",HttpStatus.CREATED); 
        }
        // Otherwise, creat a new inventory.
        else{
            inventoryRepository.save(inventory);
            return new ResponseEntity<Object>("Inventory has been created successfully",HttpStatus.OK); 
        }
    }
    @RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
    public ResponseEntity<Object> delete(@PathVariable("id") String id){
        Optional<Inventory> org = inventoryRepository.findById(Integer.valueOf(id));
        if(org.isPresent()){
            inventoryRepository.deleteById(Integer.valueOf(id));
            return new ResponseEntity<Object>("Inventory information has been deleted successfully",HttpStatus.OK); 
        }
        else{
            return new ResponseEntity<Object>("Inventory infromation can't not be find in database",HttpStatus.CREATED); 
        }
    }
}
