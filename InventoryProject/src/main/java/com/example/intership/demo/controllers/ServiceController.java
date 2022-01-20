package com.example.intership.demo.controllers;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import com.example.intership.demo.service.CsvExporter;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class ServiceController {
    private final CsvExporter csvExporter;
    public ServiceController(CsvExporter csvExporter){
        this.csvExporter = csvExporter;
    }
    
    @RequestMapping(value="/download")
    public void exportAllInventoryToCsv(HttpServletResponse httpServletResponse) throws IOException{
        httpServletResponse.setContentType("text/csv");
        httpServletResponse.addHeader("Content-Disposition","filename=\"Inventories.csv");
        csvExporter.exportCsvFile(httpServletResponse.getWriter());
    }
    
}
