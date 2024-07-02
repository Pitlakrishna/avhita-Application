package com.avhita.avita_application.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avhita.avita_application.model.Medical_hx;
import com.avhita.avita_application.model.Patient;
import com.avhita.avita_application.repository.Medical_hxRepository;
import com.avhita.avita_application.repository.PatientRepository;

@Service
public class MedicalHxService {
	
	@Autowired
	private Medical_hxRepository medicalHxRepository ;
	
	@Autowired
	private PatientRepository patientRepository ;
	
	 public Medical_hx getMedicalHxWithPatient(String medicalHxId) {
		 Medical_hx medicalHx = medicalHxRepository.findById(medicalHxId).orElse(null);
	        if (medicalHx != null && medicalHx.getPatient_id() != null) {
	            Patient patient = patientRepository.findById(medicalHx.getPatient_id()).orElse(null);
	            medicalHx.setPatient(patient);
	        }
	        return medicalHx;
	  }
}
