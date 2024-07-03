package com.avhita.avita_application.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.avhita.avita_application.dto.InsuranceDTO;
import com.avhita.avita_application.model.Insurance;
import com.avhita.avita_application.repository.GaurantorRepository;
import com.avhita.avita_application.repository.InsuranceRepository;
import com.avhita.avita_application.service.InsuranceService;

@Service
@RestController
public class InsuranceController {
    
	@Autowired
	private InsuranceService insuranceService ;
	
	@Autowired 
	private GaurantorRepository gaurantorRepo ;

    @PostMapping("/insurance")
    public ResponseEntity<?> createInsurance(@RequestBody Insurance insurance){
		try {
			insuranceService.save(insurance);
			return new ResponseEntity<Insurance>(insurance, HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
    
    
    @GetMapping("/getAllInsurance")
    public ResponseEntity<List<Insurance>> getAllInsurance(){
    	try {    		
    		List<Insurance> insurance = insuranceService.getAll();
    		return new ResponseEntity<>( insurance , HttpStatus.OK );
    	}catch(Exception e) {
    		return new ResponseEntity<>( null , HttpStatus.INTERNAL_SERVER_ERROR );
    	}
    }
    
    @GetMapping("/insurance-gaurantor/{insurance_id}")
    public ResponseEntity<InsuranceDTO> getInsuranceGaurantor( @PathVariable String insurance_id ){
    	InsuranceDTO insuranceDTO = insuranceService.getInsuranceById(insurance_id);
    	return ResponseEntity.ok(insuranceDTO);
//    	if( insuranceOpt.isPresent()) {
//    		Insurance insurance = insuranceOpt.get();
//    		return new ResponseEntity<>( insurance , HttpStatus.OK );
//    	}
//    	else {
//    		return new ResponseEntity<>( "Insurance not found" , HttpStatus.NOT_FOUND);
//    	}
    } 
}