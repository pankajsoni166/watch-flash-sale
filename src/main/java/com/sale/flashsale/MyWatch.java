package com.sale.flashsale;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyWatch {
	
	@Id
	private Long id;
	private String model;
	private String make;
	
	public MyWatch() {
		super();
	}
	
	public MyWatch(Long id, String model, String make) {
		super();
		this.id = id;
		this.model = model;
		this.make = make;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
