package com.avhita.avita_application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avhita.avita_application.model.Address;
import com.avhita.avita_application.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class addressController {
    @Autowired
    private AddressRepository addressRepo;

    @PostMapping("/create_address")
    public ResponseEntity<?> create_address(@RequestBody Address form) {
        try {
            addressRepo.save(form);
            return new ResponseEntity<Address>(form, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
     }
}
