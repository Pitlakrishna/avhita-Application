package com.avhita.avita_application.repository;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import com.avhita.avita_application.model.Medical_hx;

@Repository
public interface Medical_hxRepository extends MongoRepository<Medical_hx, String> {
	@Query("{ 'patient_id' : ?0 }")
    List<Medical_hx> findMedicalHxByPatientId(String patient_id);
}
