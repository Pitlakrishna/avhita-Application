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
@Document(collection = "address")

public class Address {
	@Id
	@Indexed(unique = true)
	private String address_id;
	private String address_label;
	private String address_line1;
	private String address_line2;
	private String city;
	private String state;
	private String zip_code;

}

