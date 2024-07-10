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
@Document( collection="provider" )

public class Provider{
	
	@Id
	@Indexed(unique = true)
	public String provider_id ;
	
	public String salutation ;
	public String first_name ;
	public String middle_name ;
	public String last_name ;
	public String npi ;
	public String dea_number ;
	public String email ;
	public String cell_phone ;
	public String primary_phone ;
	public String secondary_phone ;
	public String clinic_id ;
	public String user_id ;
	
	public String getProvider_id() {
		return provider_id;
	}
	public void setProvider_id(String provider_id) {
		this.provider_id = provider_id;
	}
}
