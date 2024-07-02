package com.avhita.avita_application.model;
import java.util.Date;
import org.springframework.data.annotation.Id;
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
@Document( collection="patients" )

public class Patient {
	@Id
	public String patient_id ;
	public String first_name ;
	public String middle_name ;
	public String last_name ;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public Date dob ;
	
	public String ssn ;
	public String mrn ;
	public String primary_phone_num ;
	public String secondary_phone_num ;
	public String email_address;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public Date enroll_start_date ;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public Date enroll_end_date ;
	
	public String enroll_type ;
	public boolean has_pacemaker ;
	public boolean has_icd ;
	public String ordering_physician ;
	public String reading_physician ;
	public String referring_physician ;
	public String status;
	public boolean disabled ;
	public String language ;
	public String emergency_contact ;
	public String address_id ;
	public String user_id ;
	public String updated_by ;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public Date updated_date ;
	
}
