package com.example.lab4_1.controller;
import com.example.lab4_1.entity.User;
import com.example.lab4_1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
    private UserService userService;

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Create a new user
    @PostMapping(consumes = { "application/json", "application/json;charset=UTF-8" }, produces = "application/json")
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // Delete a user by ID
    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "User with ID " + id + " has been deleted successfully.";
    }
}
