package com.avhita.avita_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avhita.avita_application.model.Insurance;
import com.avhita.avita_application.repository.GaurantorRepository;
import com.avhita.avita_application.service.InsuranceService;

@Service
@RestController
public class InsuranceController {
    
    @Autowired
    private GaurantorRepository gaurantorRepository;
    
    @Autowired
    private InsuranceService insuranceService ;

    @PostMapping("/insurance")
    public ResponseEntity<?> createInsurance(@RequestBody Insurance insurance) {
    	if (insurance.getGaurantor() != null) {
    		gaurantorRepository.findById(insurance.getGaurantor().getGaurantorId()  )
    				.orElseThrow(() -> new RuntimeException("Gaurantor not found"));
        }
        Insurance savedInsurance = insuranceService.saveInsurance(insurance);
        return new ResponseEntity<>(savedInsurance, HttpStatus.CREATED);
        
    }
}