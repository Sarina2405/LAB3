package com.example.lab4_2.service;

import com.example.lab4_2.entity.CustomerIdentification;
import com.example.lab4_2.repository.CustomerIdentificationRepository;

import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerIdentificationService {
    @Autowired
    private CustomerIdentificationRepository customerIdentificationRepository;

    // Get all users
    public List<CustomerIdentification> getAllUsers() {
        return customerIdentificationRepository.findAll();
    }

    // Save a new user
    @Transactional
    public CustomerIdentification saveUser(CustomerIdentification CustomerIdentification) {
        // Validate: Check if CUSTID_ITEM (unique field) already exists
        if (com.example.lab4_2.repository.CustomerIdentificationRepository.existsByItem(((CustomerIdentification) CustomerIdentification).getItem())) {
            throw new RuntimeException("A user with the same CUSTID_ITEM already exists");
        }
        return customerIdentificationRepository.save(CustomerIdentification);
    }

    // Delete a user by CST_ID (primary key)
    public void deleteUserById(Long id) {
        if (!customerIdentificationRepository.existsById(id)) {
            throw new RuntimeException("User with CST_ID " + id + " does not exist");
        }
        customerIdentificationRepository.deleteById(id);
    }

	public CustomerIdentification getUserByItem(String item) {
		// TODO Auto-generated method stub
		return null;
	}
}