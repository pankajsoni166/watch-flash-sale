package com.sale.flashsale;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserWatch {
	

	private Long id;
	private String name;	
	@Id
	private String email;
	
	public UserWatch() {
		super();
	}
	
	public UserWatch(Long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
