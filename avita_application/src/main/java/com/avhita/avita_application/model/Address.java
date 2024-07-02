package com.avhita.avita_application.model;
import org.springframework.data.annotation.Id;
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
	public String address_id ;
	public String address_label ;
	public String address_line1 ;
	public String address_line2 ;
	public String city ;
	public String state ;
	public String zip_code ;
	
	@DBRef
    public Patient patient;

    @DBRef
    public Gaurantor guarantor;

//    @DBRef
//    public Insurance insurance;

    @DBRef
    public Provider provider;

//    @DBRef
//    public Facility facility;

}
