package com.avhita.avita_application.model;
import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document( collection="guarantor" )

public class Gaurantor {
	@Id
	@Indexed(unique = true)
	public String gaurantor_id ;
	
	public String first_name ;
	public String last_name ;
	public String ssn ;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	public Date dob;
	
	public String policy_id ;
	public String group_id ;
	public String relationship ;
	
	
	public String getGaurantor_id() {
		return gaurantor_id;
	}


	public void setGaurantor_id(String gaurantor_id) {
		this.gaurantor_id = gaurantor_id;
	}
	
}
