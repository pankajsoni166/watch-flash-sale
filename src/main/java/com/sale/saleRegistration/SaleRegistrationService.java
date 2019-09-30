package com.sale.saleRegistration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sale.flashsale.UserSaleRegistration;
import com.sale.flashsale.UserWatch;
import com.sale.user.UserRepository;

@Service
public class SaleRegistrationService {
	
	@Autowired
	private SaleRegistrationRepository saleRegistrationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public String registerUserForSale(UserSaleRegistration userSaleRegistration) {
		boolean userPresent = checkIfUserPresentInTheSystem(userSaleRegistration.getUserEmail());
		if(userPresent) {
			saleRegistrationRepository.save(userSaleRegistration);
			return "User registered successfully for the sale";
		}
		return "User is not present in the Database";
	}
	
	private boolean checkIfUserPresentInTheSystem(String userEmail) {
		UserWatch userWatch = userRepository.findByEmail(userEmail);
		if(userWatch != null) {
			//if userWatch not null means user already present in 
			//the database with give email address
			return true;
		}
		return false;
	}

	public List<UserSaleRegistration> getAllUserRegistrations(){
		List<UserSaleRegistration> allUserRegistrations = new ArrayList<UserSaleRegistration>();
		saleRegistrationRepository.findAll().forEach(allUserRegistrations::add);
		return allUserRegistrations;
	}
}
