//package com.avhita.avita_application.controller;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.avhita.avita_application.model.AddressModel;
//import com.avhita.avita_application.model.GuarantorModel;
//import com.avhita.avita_application.model.Medical_hxModel;
//import com.avhita.avita_application.model.PatientModel;
//import com.avhita.avita_application.model.ProviderModel;
//import com.avhita.avita_application.repository.AddressRepository;
//import com.avhita.avita_application.repository.GuarantorRepository;
//import com.avhita.avita_application.repository.Medical_hxRepository;
//import com.avhita.avita_application.repository.PatientRepository;
//import com.avhita.avita_application.repository.ProviderRepository;
//
//
//@RestController
//public class avhitaController {
//	@Autowired
//	private GuarantorRepository guarantorRepo ;
//	
//	@Autowired
//	private PatientRepository patientRepo ;
//	
//	@Autowired
//	private AddressRepository addressRepo ;
//	
//	@Autowired
//	private ProviderRepository providerRepo ;
//	
//	@Autowired
//	private Medical_hxRepository medicalHxRepo ; 
//	
//	
////	Patient Controller
//	
//	 @PostMapping("/create_patient")
//	    public ResponseEntity<?> createPatient(@RequestBody PatientModel  form) {
//	        try {
//	            patientRepo.save(form);
//	            return new ResponseEntity<PatientModel>(form, HttpStatus.OK);
//	        } catch (Exception e) {
//	            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//	        }
//	    }
//	 
//	 @GetMapping("/all_patients")
//	 public ResponseEntity<?> getAllPatients(){
//			List<PatientModel> forms = patientRepo.findAll();
//			if(forms.size()>0){
//				return new ResponseEntity<List<PatientModel>>(forms , HttpStatus.OK);
//			}
//			else {
//				return new ResponseEntity<>("Data not found ..." , HttpStatus.NOT_FOUND) ;
//			}
//		}
//	 
//		@GetMapping("/patient/{id}")
//		public ResponseEntity<?> getSingleuser( @PathVariable("id") String id){
//			Optional<PatientModel> patient = patientRepo.findById(id);
//			if(patient.isPresent()){
//				return new ResponseEntity<>(patient.get() , HttpStatus.OK);
//			}
//			else{
//				return new ResponseEntity<>("User not found with id "+id , HttpStatus.NOT_FOUND);
//			}
//		}
//
////	Guarantor Controller
//	 
//	@PostMapping("/create_guarantor")
//	public ResponseEntity<?> createGuarantor( @RequestBody GuarantorModel form ){
//		try {
//			guarantorRepo.save(form) ;
//			return new ResponseEntity<GuarantorModel>(form , HttpStatus.OK) ;
//		}
//		catch(Exception e ){
//			return new ResponseEntity<>( e.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR);	
//		}
//	}
//	
////	Address Controller
//	
//	@PostMapping("/create_address")
//	
//	public ResponseEntity<?> create_address( @RequestBody AddressModel form ){
//		try {
//			addressRepo.save(form) ;
//			return new ResponseEntity<AddressModel>(form , HttpStatus.OK) ;
//		}
//		catch(Exception e){
//			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
//		}
//	}
//	
//	
////  Provider Controller
//	
//	@PostMapping("/provider_create")
//	public ResponseEntity<?> create_provider(@RequestBody  ProviderModel form){
//		try {
//			providerRepo.save(form) ;
//			return new ResponseEntity<ProviderModel>(form , HttpStatus.OK);
//		}
//		catch(Exception e) {
//			return new ResponseEntity<>(e.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR ) ;
//		}
//	}
//	
//	
////  medical_hx Controller
//	
//	@PostMapping("/create_medical_hx")
//	public ResponseEntity<?> create_medical_hx(@RequestBody Medical_hxModel form ){
//		try {
//			medicalHxRepo.save(form) ;
//			return new ResponseEntity<Medical_hxModel>( form  , HttpStatus.OK );
//		}
//		catch(Exception e) {
//			return new ResponseEntity<>(e.getMessage() , HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
//	
//}
//
//
