package com.avhita.avita_application.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
@Document(collection = "patients")

public class Patient {

	@Id
	@Indexed(unique = true)
	private String patient_id;

	private String first_name;
	private String middle_name;
	private String last_name;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date dob;

	private String ssn;
	private String mrn;
	private String primary_phone_num;
	private String secondary_phone_num;
	private String email_address;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date enroll_start_date;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date enroll_end_date;

	private String enroll_type;
	private boolean has_pacemaker;
	private boolean has_icd;
	private String ordering_physician;
	private String reading_physician;
	private String referring_physician;
	private String status;
	private boolean disabled;
	private String language;
	private String emergency_contact;

	@DBRef
	private Address address;

	@DBRef
	private Provider user;

	private String updated_by;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date updated_date;
}
