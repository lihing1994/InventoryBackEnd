package com.example.intership.demo.service;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import com.example.intership.demo.repository.InventoryRepository;
import com.example.intership.demo.model.Inventory;
@Service
public class CsvExporter {
    private final InventoryRepository inventoryRepository;
    public CsvExporter(InventoryRepository inventoryRepository){
        this.inventoryRepository = inventoryRepository;
    }
    public void exportCsvFile(Writer writer) throws IOException{
        List<Inventory> inventories = inventoryRepository.findAll();
        try(CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT)){
            for(int i =0;i<inventories.size();i++){
                Inventory current = inventories.get(i);
                csvPrinter.printRecord(current.getId(),current.getName(),current.getQuantity(),current.getQuantity(),current.getLocation(),current.getStatus());
            }
        }
    }
}
