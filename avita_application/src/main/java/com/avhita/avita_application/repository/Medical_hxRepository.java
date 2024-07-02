package com.avhita.avita_application.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.avhita.avita_application.model.Medical_hx;

@Repository
public interface Medical_hxRepository extends MongoRepository< Medical_hx , String > {

}
