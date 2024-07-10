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
@Document( collection="patients" )

public class Patient {
	
	@Id
	@Indexed(unique = true)
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
	
	@DBRef
	private Address address;
	
	@DBRef
	public Provider user ;
	
	public String updated_by ;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public Date updated_date ;
	
	public String getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(String patient_id) {
		this.patient_id = patient_id;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Provider getUser(){
		return user;
	}
	public void setUser( Provider user ){
		this.user = user;
	}

}
