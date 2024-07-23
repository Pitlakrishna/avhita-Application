package com.avhita.avita_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avhita.avita_application.model.Gaurantor;
import com.avhita.avita_application.repository.GaurantorRepository;

@RestController
@RequestMapping("/guarantor")
public class gaurnatorController {
	@Autowired
	private GaurantorRepository gaurnatorRepo;

	@PostMapping("/create_guarantor")
	public ResponseEntity<?> createGuarantor(@RequestBody Gaurantor form) {
		try {
			gaurnatorRepo.save(form);
			return new ResponseEntity<Gaurantor>(form, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
