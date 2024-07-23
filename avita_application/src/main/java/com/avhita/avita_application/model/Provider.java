package com.avhita.avita_application.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "provider")

public class Provider {

	@Id
	@Indexed(unique = true)
	private String provider_id;

	private String salutation;
	private String first_name;
	private String middle_name;
	private String last_name;
	private String npi;
	private String dea_number;
	private String email;
	private String cell_phone;
	private String primary_phone;
	private String secondary_phone;
	private String clinic_id;
	private String user_id;

	public String getProvider_id() {
		return provider_id;
	}

	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}
}
