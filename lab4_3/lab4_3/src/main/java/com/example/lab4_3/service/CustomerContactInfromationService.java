package com.example.lab4_3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab4_3.entity.CustomerContactInfromation;
import com.example.lab4_3.repository.CustomerContactInfromationRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerContactInfromationService {
	@Autowired
    private CustomerContactInfromationRepository customerCIRepository;

    // Get all records
    public List<CustomerContactInfromation> getAllRecords() {
        return customerCIRepository.findAll();
    }

    // Save a new record
    @Transactional
    public CustomerContactInfromation saveRecord(CustomerContactInfromation customerCI) {
        return customerCIRepository.save(customerCI);
    }

    // Delete a record by CST_ID
    public void deleteRecordById(Long id) {
        if (!customerCIRepository.existsById(id)) {
            throw new RuntimeException("Record with CST_ID " + id + " does not exist");
        }
        customerCIRepository.deleteById(id);
    }

    // Get records by contact type
    public List<CustomerContactInfromation> getRecordsByContactType(String contactType) {
        return customerCIRepository.findByContactType(contactType);
    }
}
