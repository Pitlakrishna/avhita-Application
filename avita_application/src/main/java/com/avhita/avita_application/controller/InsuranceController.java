package com.avhita.avita_application.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.avhita.avita_application.model.Insurance;
import com.avhita.avita_application.repository.GaurantorRepository;
import com.avhita.avita_application.repository.InsuranceRepository;

@Service
@RestController
public class InsuranceController {
    
	@Autowired
	private InsuranceRepository insuranceRepo ;
	
	@Autowired 
	private GaurantorRepository gaurantorRepo ;

    @PostMapping("/insurance")
    public ResponseEntity<?> createInsurance(@RequestBody Insurance insurance){
		try {
			insuranceRepo.save(insurance);
			return new ResponseEntity<Insurance>(insurance, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    
    @GetMapping("/getAllInsurance")
    public ResponseEntity<List<Insurance>> getInsuranceGaurantor(){
    	try {    		
    		List<Insurance> insurance = insuranceRepo.findAll();
    		return new ResponseEntity<>( insurance , HttpStatus.OK );
    	}catch(Exception e) {
    		return new ResponseEntity<>( null , HttpStatus.INTERNAL_SERVER_ERROR );
    	}
    }
    
//    @GetMapping("/insurance-gaurantor/{insurance_id}")
//    public ResponseEntity<?> getInsuranceGaurantor( @PathVariable String insurance_id ){
//    	Optional<Insurance> insuranceOpt
//    }
    
    
}