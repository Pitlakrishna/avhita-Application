package com.avhita.avita_application.model;
import org.springframework.data.annotation.Id;
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
	
//	@CreatedDate
//	private LocalDateTime created_at ;
//	
//	@LastModifiedDate
//	private LocalDateTime updated_at ;
//	
//	//Getter and Setters
//	public LocalDateTime getCreated_at(){	
//		return created_at ;
//	}
//	
//	public void setCreated_at(LocalDateTime created_at  ) {
//		this.created_at = created_at ;
//	}
//	
//	public LocalDateTime getUpdated_at() {
//		return updated_at ;
//	}
//	
//	public void setUpdated_at( LocalDateTime updated_at ) {
//		this.updated_at = updated_at ;
//	} 
	
}
