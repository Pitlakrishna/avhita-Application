package com.avhita.avita_application.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

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
	@Indexed(unique = true)
	public String medical_hx_id;
	
	@NonNull
	public String patient_id ;
	
	public String diagnosis ;
	public String medications ;
	public String social_hx ;
	public String pediatric_electrodes ;
	public String sensitive_skin;
	public String prior_cardia_hx ;
	
}


