package com.avhita.avita_application.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avhita.avita_application.model.Patient;
import com.avhita.avita_application.service.PatientService;

@RestController
@RequestMapping("/patients")
public class patientController {

	@Autowired
	private PatientService patientService;

	@PostMapping("/create_patient")
	public ResponseEntity<?> createPatient(@RequestBody Patient patient) {
		try {
			patientService.savePatient(patient);
			return new ResponseEntity<Patient>(patient, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping
	public ResponseEntity<?> getAllPatients() {
		List<Patient> forms = patientService.findAllPatients();
		if (forms.size() > 0) {
			return new ResponseEntity<List<Patient>>(forms, HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Data not found ...", HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/patient/{id}")
	public ResponseEntity<?> getSingleuser(@PathVariable("id") String id) {
		Optional<Patient> patient = patientService.findByIdPatient(id);
		if (patient.isPresent()) {
			return new ResponseEntity<>(patient.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>("User not found with id " + id, HttpStatus.NOT_FOUND);
		}
	}

}
