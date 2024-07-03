package com.avhita.avita_application.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avhita.avita_application.model.Medical_hx;
import com.avhita.avita_application.repository.Medical_hxRepository;

@Service
public class MedicalHxService {
	
	@Autowired
	private Medical_hxRepository medicalHxRepository ;
	
	
	 public Medical_hx getMedicalHxWithPatient(String medicalHxId) {
		 Medical_hx medicalHx = medicalHxRepository.findById(medicalHxId)
					.orElseThrow(() -> new RuntimeException("MedicalHx not found"));
	        return medicalHx;
	  }
}
