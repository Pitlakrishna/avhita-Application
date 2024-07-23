package com.avhita.avita_application.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "guarantor")

public class Gaurantor {
	@Id
	@Indexed(unique = true)
	private String gaurantor_id;

	private String first_name;
	private String last_name;
	private String ssn;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dob;

	private String policy_id;
	private String group_id;
	private String relationship;

	public String getGaurantor_id() {
		return gaurantor_id;
	}

	public void setGaurantor_id(String gaurantor_id) {
		this.gaurantor_id = gaurantor_id;
	}

}
