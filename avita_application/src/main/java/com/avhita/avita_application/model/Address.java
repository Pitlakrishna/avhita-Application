package com.avhita.avita_application.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
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
@Document( collection="address" )

public class Address {
	@Id
	@Indexed(unique = true)
	public String address_id ;
	public String address_label ;
	public String address_line1 ;
	public String address_line2 ;
	public String city ;
	public String state ;
	public String zip_code ;
	
	public String getAddress_id() {
		return address_id;
	}
	public void setAddress_id(String address_id) {
		this.address_id = address_id;
	}

}
