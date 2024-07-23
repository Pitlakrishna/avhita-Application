package com.avhita.avita_application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
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
@Document(collection = "medical_hx")

public class Medical_hx {
	@Id
	@Indexed(unique = true)
	private String medical_hx_id;

	@NonNull
	private String patient_id;

	private String diagnosis;
	private String medications;
	private String social_hx;
	private String pediatric_electrodes;
	private String sensitive_skin;
	private String prior_cardia_hx;

}
