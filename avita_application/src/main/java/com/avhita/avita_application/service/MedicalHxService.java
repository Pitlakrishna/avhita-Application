package com.avhita.avita_application.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.avhita.avita_application.model.Medical_hx;
import com.avhita.avita_application.model.Patient;
import com.avhita.avita_application.repository.Medical_hxRepository;
import com.avhita.avita_application.repository.PatientRepository;

@Service
public class MedicalHxService {
	
	@Autowired
	private Medical_hxRepository medicalHxRepo;
	
	@Autowired
	private PatientRepository patientRepo ;
	
	public Medical_hx save( Medical_hx  medicalHx ) {
//		if( medicalHx.getPatient() != null ) {
//			Patient patient = patientRepo.findById(medicalHx.getPatient().getPatient_id())
//					.orElseThrow(()-> new RuntimeException("Patient not Found") );
//			medicalHx.setPatient(patient);
//		}
		return medicalHxRepo.save(medicalHx);
	}
	
	public List<Medical_hx> getMedicalHistoryByPatientId(String patient_id) {
        return medicalHxRepo.findMedicalHxByPatientId(patient_id);
    }
}
