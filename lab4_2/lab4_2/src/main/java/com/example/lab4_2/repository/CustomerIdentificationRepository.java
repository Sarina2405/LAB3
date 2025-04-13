package com.example.lab4_2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lab4_2.entity.CustomerIdentification;

public interface CustomerIdentificationRepository extends JpaRepository <CustomerIdentification, Long>  {

	static boolean existsByItem(String item) {
		// TODO Auto-generated method stub
		return false;
	}


}
