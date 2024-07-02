package com.avhita.avita_application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "insurance")
public class Insurance {
	@Id
	public String insurance_id;
	
	@DBRef
	public Gaurantor gaurantor;
	
	public String policy_name;
	public String policy_id;
	public String group_id;
	public String policy_type;
	public String relationship_to_policyholder;
	public String dob;
	public String employer_name;
	public String payer_phone_num;
	public String insurance_state;
	public String insurance_card_scanned;
	public String auth_number;
	public boolean belongs_to_ina;
	
	
	public Gaurantor getGaurantor() {
		return gaurantor ;
	}
}
