package com.avhita.avita_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.avhita.avita_application.model.Provider;
import com.avhita.avita_application.repository.ProviderRepository;

@RestController
@RequestMapping("/provider")
public class providerController {
	@Autowired
	private ProviderRepository providerRepo;

	@PostMapping("/provider_create")
	public ResponseEntity<?> create_provider(@RequestBody Provider form) {
		try {
			providerRepo.save(form);
			return new ResponseEntity<Provider>(form, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
