package com.example.lab4_3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab4_3.entity.CustomerContactInfromation;
import com.example.lab4_3.service.CustomerContactInfromationService;

@RestController
@RequestMapping("/api/customer-ci")
public class CustomerContactInfromationController {
	@Autowired
    private CustomerContactInfromationService customerCIService;

    // Get all customer CI records
    @GetMapping
    public List<CustomerContactInfromation> getAllRecords() {
        return customerCIService.getAllRecords();
    }

    // Create a new record
    @PostMapping(consumes = { "application/json", "application/json;charset=UTF-8" }, produces = "application/json")
    public CustomerContactInfromation createRecord(@RequestBody CustomerContactInfromation customerCI) {
        return customerCIService.saveRecord(customerCI);
    }

    // Delete a record by CST_ID
    @DeleteMapping("/{id}")
    public String deleteRecordById(@PathVariable Long id) {
        customerCIService.deleteRecordById(id);
        return "Record with CST_ID " + id + " has been deleted successfully.";
    }

    // Get a record by contact type
    @GetMapping("/contact-type/{type}")
    public List<CustomerContactInfromation> getRecordsByContactType(@PathVariable String type) {
        return customerCIService.getRecordsByContactType(type);
    }

}
