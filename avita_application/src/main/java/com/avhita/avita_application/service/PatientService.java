package com.avhita.avita_application.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avhita.avita_application.model.Address;
import com.avhita.avita_application.model.Patient;
import com.avhita.avita_application.model.Provider;
import com.avhita.avita_application.repository.AddressRepository;
import com.avhita.avita_application.repository.PatientRepository;
import com.avhita.avita_application.repository.ProviderRepository;

@Service
public class PatientService {
	
	@Autowired
	private PatientRepository patientRepo ;
	
	@Autowired
	private AddressRepository addressRepo;
	
	@Autowired
	private ProviderRepository providerRepo ;
	
	public void savePatient( Patient patient ) {
		if( patient.getAddress() != null && patient.getUser() != null ) {
			Address address = addressRepo.findById(patient.getAddress().getAddress_id())
					.orElseThrow( () -> new RuntimeException(" Address not found ")  ); 
			
			Provider provider = providerRepo.findById(patient.getUser().getProvider_id())
					.orElseThrow( () -> new RuntimeException(" Provider not found " )); 
			
			patient.setAddress(address);
			patient.setUser(provider);
		}
		patientRepo.save(patient);
	}
	
	public List<Patient> findAllPatients() {
		return patientRepo.findAll();
	}
	
	public Optional<Patient> findByIdPatient( String id ){
		
		return patientRepo.findById(id);
	}
	
}
