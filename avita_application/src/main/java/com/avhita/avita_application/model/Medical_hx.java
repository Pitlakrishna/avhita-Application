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
@AllArgsConstructor
@NoArgsConstructor
@Document( collection="medical_hx" )

public class Medical_hx {
	@Id
	public String medical_hx_id ;
	public String patient_id ;
	public String diagnosis ;
	public String medications ;
	public String social_hx ;
	public String pediatric_electrodes ;
	public String sensitive_skin;
	public String prior_cardia_hx ;
	
	@DBRef
    public Patient patient;

	public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }
    
    public Patient getPatient() {
    	return patient;
    }
    
    public void setPatient(Patient patient) {
    	this.patient = patient ;
    }
	
}


