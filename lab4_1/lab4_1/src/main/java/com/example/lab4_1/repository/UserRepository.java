package com.example.lab4_1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab4_1.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {

	boolean existsByUuid(String uuid);

}
