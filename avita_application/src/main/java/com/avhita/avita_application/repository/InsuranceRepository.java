package com.avhita.avita_application.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.avhita.avita_application.model.Insurance;

public interface InsuranceRepository extends MongoRepository< Insurance , String> {
	
}
