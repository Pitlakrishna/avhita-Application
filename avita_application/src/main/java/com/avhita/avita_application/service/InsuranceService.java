//package com.avhita.avita_application.service;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.avhita.avita_application.model.Insurance;
//import com.avhita.avita_application.repository.InsuranceRepository;
//
//@Service
//public class InsuranceService {
////	
//	@Autowired
//	private InsuranceRepository insuranceRepository ;
//	
//	public Insurance insurance(String  ) {
//		
//        Optional<RoleModel> roleOpt = roleRepository.findById(role_id);
//
//        if (roleOpt.isPresent()) {
//            PermissionModel permissionModel = new PermissionModel();
//            permissionModel.setRole(roleOpt.get());
//            permissionModel.setPermission_id(permission_id);
//            permissionModel.setPermissions(permissions);
//            return permissionRepository.save(permissionModel);
//        } else {
//            throw new RuntimeException("Role not found with id: " + role_id);
//        }
//    }
//}