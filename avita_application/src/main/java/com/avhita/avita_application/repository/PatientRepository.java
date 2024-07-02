package com.avhita.avita_application.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.avhita.avita_application.model.Patient;

@Repository
public interface PatientRepository extends MongoRepository< Patient , String > {

}
