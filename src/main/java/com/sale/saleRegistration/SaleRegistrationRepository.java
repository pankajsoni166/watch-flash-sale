package com.sale.saleRegistration;

import org.springframework.data.repository.CrudRepository;

import com.sale.flashsale.UserSaleRegistration;

public interface SaleRegistrationRepository extends CrudRepository<UserSaleRegistration, String>{
	
	public UserSaleRegistration findBySaleIdAndUserId(Long saleId, Long userId);
}
