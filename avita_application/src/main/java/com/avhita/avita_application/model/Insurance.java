package com.avhita.avita_application.model;

import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.DBRef;
//import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Setter
//@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "insurance")
public class Insurance {
	@Id
	public String insurance_id;
	public String gaurantor_id;
	public String policy_name;
	public String policy_id;
	public String groupd_id;
	public String policy_type;
	public String relationship_to_policyholder;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public String dob;
	
	public String employer_name;
	public String payer_phone_num;
	public String insurance_state;
	public String insurance_card_scanned;
	public String auth_number;
	public boolean belongs_to_ina;
	
//	public String getGaurantor_id() {
//        return gaurantor != null ? gaurantor.getGaurantor_id() : null;
//    }
//	
//	public Gaurantor getGaurantor() {
//		return gaurantor ;
//	}
//
//	public void setGaurantor(Gaurantor gaurantor) {
//		this.gaurantor = gaurantor ;
//	}
}
