package com.example.lab4_3.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab4_3.entity.CustomerContactInfromation;

public interface CustomerContactInfromationRepository extends JpaRepository <CustomerContactInfromation, Long> {

	List<CustomerContactInfromation> findByContactType(String contactType);

}
