package com.avhita.avita_application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avhita.avita_application.dto.InsuranceDTO;
import com.avhita.avita_application.model.Gaurantor;
import com.avhita.avita_application.model.Insurance;
import com.avhita.avita_application.repository.GaurantorRepository;
import com.avhita.avita_application.repository.InsuranceRepository;

@Service
public class InsuranceService {

	@Autowired
	private InsuranceRepository insuranceRepository;

	@Autowired
	private GaurantorRepository gaurantorRepository;

	public void save(Insurance insurance) {
		if (insurance.getGaurantor() != null) {
			Gaurantor gaurantor = gaurantorRepository.findById(insurance.getGaurantor().getGaurantor_id())
					.orElseThrow( () -> new RuntimeException("Gaurantor not found") );
			insurance.setGaurantor(gaurantor);
		}
		insuranceRepository.save(insurance);
	}

	public List<Insurance> getAll() {
		return insuranceRepository.findAll();
	}

	public InsuranceDTO getInsuranceById(String insuranceId) {
		Insurance insurance = insuranceRepository.findById(insuranceId)
				.orElseThrow(() -> new RuntimeException("Insurance not found"));
		
		if(insurance.getGaurantor() == null) {
			throw new RuntimeException("Gaurantor reference is null in the insurance Object");
		}
		
		Gaurantor gaurantor = gaurantorRepository.findById(insurance.getGaurantor().getGaurantor_id())
				.orElseThrow(() -> new RuntimeException("Gaurantor not found"));

		InsuranceDTO insuranceDTO = new InsuranceDTO();
		insuranceDTO.setInsurance_id(insurance.getInsurance_id());
		insuranceDTO.setGaurantor_id(gaurantor);
		insuranceDTO.setPolicy_name(insurance.getPolicy_name());
		insuranceDTO.setPolicy_id(insurance.getPolicy_id());
		insuranceDTO.setGroupd_id(insurance.getGroupd_id());
		insuranceDTO.setPolicy_type(insurance.getPolicy_type());
		insuranceDTO.setRelationship_to_policyholder(insurance.getRelationship_to_policyholder());
		insuranceDTO.setDob(insurance.getDob());
		insuranceDTO.setEmployer_name(insurance.getEmployer_name());
		insuranceDTO.setPayer_phone_num(insurance.getPayer_phone_num());
		insuranceDTO.setInsurance_state(insurance.getInsurance_state());
		insuranceDTO.setInsurance_card_scanned(insurance.getInsurance_card_scanned());
		insuranceDTO.setAuth_number(insurance.getAuth_number());
		insuranceDTO.setBelongs_to_ina(insurance.getBelongs_to_ina());

		return insuranceDTO;
	}
}
