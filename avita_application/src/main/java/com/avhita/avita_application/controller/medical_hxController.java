package com.avhita.avita_application.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.avhita.avita_application.model.Medical_hx;
import com.avhita.avita_application.repository.Medical_hxRepository;
import com.avhita.avita_application.service.MedicalHxService;

@RestController
public class medical_hxController {
	@Autowired
	private Medical_hxRepository medicalHxRepo ; 

    @Autowired
    private MedicalHxService medicalHxService;
//	
	@PostMapping("/create_medical_hx")
	public ResponseEntity<?> create_medical_hx(@RequestBody Medical_hx form ){
		try {
			
			medicalHxRepo.save(form) ;
			return new ResponseEntity<Medical_hx>( form  , HttpStatus.OK );
		}
		catch(Exception e) {
			return new ResponseEntity<>(e.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/medic	alHx/{id}")
    public ResponseEntity<?> getMedicalHx(@PathVariable String id) {
        try {
            Medical_hx medicalHx = medicalHxService.getMedicalHxWithPatient(id);
            if (medicalHx != null) {
                return new ResponseEntity<>(medicalHx, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Medical history not found for id: " + id, HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
	

}
