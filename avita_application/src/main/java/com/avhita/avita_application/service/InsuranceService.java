package com.avhita.avita_application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avhita.avita_application.model.Insurance;
import com.avhita.avita_application.repository.InsuranceRepository;

@Service
public class InsuranceService {
	
	@Autowired
	private InsuranceRepository insuranceRepository ;
	
	public Insurance saveInsurance( Insurance insurance ) {
		return insuranceRepository.save(insurance);	
	}
}
