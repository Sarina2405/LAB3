package com.example.lab4_4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab4_4.entity.ProofOfId;
import com.example.lab4_4.repository.ProofOfIdRepository;

import jakarta.transaction.Transactional;

@Service
public class ProofOfIdService {
	@Autowired
    private ProofOfIdRepository custPoiRepository;

    // Get all records
    public List<ProofOfId> getAllRecords() {
        return custPoiRepository.findAll();
    }

    // Save a new record
    @Transactional
    public ProofOfId saveRecord(ProofOfId custPoi) {
        return custPoiRepository.save(custPoi);
    }

    // Delete a record by CST_ID and CSTPOI_CLS_ID
    public void deleteRecordById(Long cstId, Long cstPoiClsId) {
        ProofOfId id = new ProofOfId(cstId, cstPoiClsId);  // Ensure parameters exist

        if (!custPoiRepository.existsById(id)) {  
            throw new RuntimeException("Record with CST_ID " + cstId + " and CSTPOI_CLS_ID " + cstPoiClsId + " does not exist");
        }

        custPoiRepository.deleteById(id);
    }

    // Get records by CSTPOI_VALUE
    public List<ProofOfId> getRecordsByValue(String cstPoiValue) {
        return custPoiRepository.findByValue(cstPoiValue);
    }
}


