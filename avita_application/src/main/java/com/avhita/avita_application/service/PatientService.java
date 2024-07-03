package com.avhita.avita_application.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avhita.avita_application.model.Address;
import com.avhita.avita_application.model.Patient;
import com.avhita.avita_application.repository.AddressRepository;
import com.avhita.avita_application.repository.PatientRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepo ;
	
	@Autowired
	private AddressRepository addressRepo;
	
	public void savePatient( Patient patient ) {
		if( patient.getAddress() != null ) {
			Address address = addressRepo.findById(patient.getAddress().getAddress_id())
					.orElseThrow( () -> new RuntimeException(" Address not found ")  ); 
			patient.setAddress(address);
		}
		patientRepo.save(patient);
	}
	
	public List<Patient> findAllPatients(  ) {
		return patientRepo.findAll();
	}
	
	public Optional<Patient> findByIdPatient( String id ){
		
		return patientRepo.findById(id);
	}
	
}
