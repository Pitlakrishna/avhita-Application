package com.avhita.avita_application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avhita.avita_application.model.Medical_hx;
import com.avhita.avita_application.service.MedicalHxService;

@RestController
@RequestMapping("/medical_hx")
public class medical_hxController {

	@Autowired
	private MedicalHxService medicalHxService;

	//
	@PostMapping("/create_medical_hx")
	public ResponseEntity<?> create_medical_hx(@RequestBody Medical_hx form) {
		try {

			Medical_hx savedMedicalHx = medicalHxService.save(form);
			return new ResponseEntity<Medical_hx>(savedMedicalHx, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("/medicalHx/{patient_id}")
	public ResponseEntity<List<Medical_hx>> getMedicalHxByPatientId(@PathVariable String patient_id) {
		try {
			List<Medical_hx> medicalHxList = medicalHxService.getMedicalHistoryByPatientId(patient_id);
			return new ResponseEntity<>(medicalHxList, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
