package com.example.lab4_4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab4_4.entity.ProofOfId;
import com.example.lab4_4.service.ProofOfIdService;

@RestController
@RequestMapping("/api/customer-poi")
public class ProofOfIdController {
	@Autowired
    private ProofOfIdService customerPOIService;

    // Get all customer POI records
    @GetMapping
    public List<ProofOfId> getAllRecords() {
        return customerPOIService.getAllRecords();
    }

    // Create a new record
    @PostMapping(consumes = "application/json", produces = "application/json")
    public ProofOfId createRecord(@RequestBody ProofOfId customerPOI) {
        return customerPOIService.saveRecord(customerPOI);
    }

    // Delete a record by Customer ID and Classification ID (Composite Key)
    @DeleteMapping("/{customerId}/{classificationId}")
    public String deleteRecordById(@PathVariable Long customerId, @PathVariable Long classificationId) {
        customerPOIService.deleteRecordById(customerId, classificationId);
        return "Record with CST_ID " + customerId + " and CSTPOI_CLS_ID " + classificationId + " has been deleted successfully.";
    }

    // Get records by CSTPOI_VALUE
    @GetMapping("/value/{cstPoiValue}")
    public List<ProofOfId> getRecordsByValue(@PathVariable String cstPoiValue) {
        return customerPOIService.getRecordsByValue(cstPoiValue);
    }
}