package com.example.lab4_1.service;

import com.example.lab4_1.entity.User;
import com.example.lab4_1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	@Autowired
    private UserRepository userRepository;

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Save a new user
    public User saveUser(User user) {
        // Optional validation: check if UUID is unique
        if (userRepository.existsByUuid(user.getUuid())) {
            throw new RuntimeException("A user with the same UUID already exists");
        }
        return userRepository.save(user);
    }

    // Delete a user by ID
    public void deleteUserById(Long id) {
        if (!userRepository.existsById(id)) {
            throw new RuntimeException("User with ID " + id + " does not exist");
        }
        userRepository.deleteById(id);
    }
}
