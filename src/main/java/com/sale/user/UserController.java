package com.sale.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sale.flashsale.UserWatch;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, value = "users")
	public List<UserWatch> getAllUser(){
		return userService.getAllUser();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "users")
	public void addAllUser(@RequestBody List<UserWatch> users) {
		userService.addAllUser(users);
	}
}
