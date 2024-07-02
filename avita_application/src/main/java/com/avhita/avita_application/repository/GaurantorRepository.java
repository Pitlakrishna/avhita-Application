package com.avhita.avita_application.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.avhita.avita_application.model.Gaurantor;

@Repository
public interface GaurantorRepository extends MongoRepository< Gaurantor , String > {

}
