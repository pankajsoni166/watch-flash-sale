package com.sale.saleRegistration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sale.flashsale.UserSaleRegistration;

@RestController
public class SaleRegistrationController {

	@Autowired
	private SaleRegistrationService saleRegistrationService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/registerUserForSale")
	public String registerUserForSale(@RequestBody UserSaleRegistration userSaleRegistration) {
		return saleRegistrationService.registerUserForSale(userSaleRegistration);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getRegisteredUseForSale")
	public List<UserSaleRegistration> getRegisteredUserForSale() {
		return saleRegistrationService.getAllUserRegistrations();
	}
}
