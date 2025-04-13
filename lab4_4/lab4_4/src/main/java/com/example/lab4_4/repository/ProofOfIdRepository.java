package com.example.lab4_4.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.lab4_4.entity.ProofOfId;

public interface ProofOfIdRepository extends JpaRepository <ProofOfId, ProofOfId>{

	@Query("SELECT p FROM ProofOfId p WHERE p.value = :value") 
	List<ProofOfId> findByValue(@Param("value") String value);
}
