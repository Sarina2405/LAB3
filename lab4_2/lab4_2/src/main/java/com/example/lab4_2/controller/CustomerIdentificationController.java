package com.example.lab4_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lab4_2.entity.CustomerIdentification;
import com.example.lab4_2.service.CustomerIdentificationService;

@RestController
@RequestMapping("/api/customers")
public class CustomerIdentificationController {
	@Autowired
    private CustomerIdentificationService customerIdentificationService;

    // Get all users
    @GetMapping
    public List<CustomerIdentification> getAllUsers() {
        return customerIdentificationService.getAllUsers();
    }

    // Create a new user
    @PostMapping(consumes = { "application/json", "application/json;charset=UTF-8" }, produces = "application/json")
    public CustomerIdentification createUser(@RequestBody CustomerIdentification customerIdentification) {
        return customerIdentificationService.saveUser(customerIdentification);
    }

    // Delete a user by CST_ID
    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
    	customerIdentificationService.deleteUserById(id);
        return "User with CST_ID " + id + " has been deleted successfully.";
    }

    // Get user by unique CUSTID_ITEM
    @GetMapping("/item/{item}")
    public CustomerIdentification getUserByItem(@PathVariable String item) {
        return customerIdentificationService.getUserByItem(item);
    }
}
