package com.avhita.avita_application.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.avhita.avita_application.model.Address;

@Repository
public interface AddressRepository extends MongoRepository<Address , String> {
	
}
