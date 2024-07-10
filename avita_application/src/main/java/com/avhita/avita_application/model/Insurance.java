package com.avhita.avita_application.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "insurance")
public class Insurance {
	@Id
	@Indexed(unique = true)
	private String insurance_id;
	
	@DBRef
	private Gaurantor gaurantor;
	
	private String policy_name;
	private String policy_id;
	private String groupd_id;
	private String policy_type;
	private String relationship_to_policyholder;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private String dob;
	
	private String employer_name;
	private String payer_phone_num;
	private String insurance_state;
	private String insurance_card_scanned;
	private String auth_number;
	private boolean belongs_to_ina;
	
	
	public Gaurantor getGaurantor() {
		return gaurantor;
	}
	public void setGaurantor(Gaurantor gaurantor) {
		this.gaurantor = gaurantor;
	}
	
	public String getInsurance_id() {
		return insurance_id;
	}
	public void setInsurance_id(String insurance_id) {
		this.insurance_id = insurance_id;
	}
	public String getPolicy_name() {
		return policy_name;
	}
	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}
	public String getPolicy_id() {
		return policy_id;
	}
	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}
	public String getGroupd_id() {
		return groupd_id;
	}
	public void setGroupd_id(String groupd_id) {
		this.groupd_id = groupd_id;
	}
	public String getPolicy_type() {
		return policy_type;
	}
	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}
	public String getRelationship_to_policyholder() {
		return relationship_to_policyholder;
	}
	public void setRelationship_to_policyholder(String relationship_to_policyholder) {
		this.relationship_to_policyholder = relationship_to_policyholder;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmployer_name() {
		return employer_name;
	}
	public void setEmployer_name(String employer_name) {
		this.employer_name = employer_name;
	}
	public String getPayer_phone_num() {
		return payer_phone_num;
	}
	public void setPayer_phone_num(String payer_phone_num) {
		this.payer_phone_num = payer_phone_num;
	}
	public String getInsurance_state() {
		return insurance_state;
	}
	public void setInsurance_state(String insurance_state) {
		this.insurance_state = insurance_state;
	}
	public String getInsurance_card_scanned() {
		return insurance_card_scanned;
	}
	public void setInsurance_card_scanned(String insurance_card_scanned) {
		this.insurance_card_scanned = insurance_card_scanned;
	}
	public String getAuth_number() {
		return auth_number;
	}
	public void setAuth_number(String auth_number) {
		this.auth_number = auth_number;
	}
	public boolean getBelongs_to_ina() {
		return belongs_to_ina;
	}
	public void setBelongs_to_ina(boolean belongs_to_ina) {
		this.belongs_to_ina = belongs_to_ina;
	}
	
	
}
