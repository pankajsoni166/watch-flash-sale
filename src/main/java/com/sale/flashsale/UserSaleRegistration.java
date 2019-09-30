package com.sale.flashsale;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserSaleRegistration {
	
	@Id
	private Long id;
	private Long userId;
	private String userEmail;
	private Long saleId;
	private Long watchId;
	
	public UserSaleRegistration() {
		super();
	}
	

	public UserSaleRegistration(Long id, Long userId, String userEmail, Long saleId, Long watchId) {
		super();
		this.id = id;
		this.userId = userId;
		this.userEmail = userEmail;
		this.saleId = saleId;
		this.watchId = watchId;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public Long getWatchId() {
		return watchId;
	}

	public void setWatchId(Long watchId) {
		this.watchId = watchId;
	}
	
	
	
}
