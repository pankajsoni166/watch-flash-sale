package com.sale.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sale.flashsale.UserWatch;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserWatch> getAllUser() {
		List<UserWatch> allUser = new ArrayList<>();
		userRepository.findAll().forEach(allUser::add);
		return allUser;
	}
	
	public void addAllUser(List<UserWatch> allUser) {
		userRepository.saveAll(allUser);
	}
}
