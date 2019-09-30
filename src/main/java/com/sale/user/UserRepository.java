package com.sale.user;

import org.springframework.data.repository.CrudRepository;

import com.sale.flashsale.UserWatch;

public interface UserRepository extends CrudRepository<UserWatch, Long>{

	public UserWatch findByEmail(String userEmail);

}
