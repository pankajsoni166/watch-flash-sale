package com.sale.flashsale;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SaleBooking {
		
	@Id
	private Long id;
	private Long watchId;
	private Long saleId;
	private Long userId;
	
	public SaleBooking() {
		super();
	}
	

	public SaleBooking(Long id, Long watchId, Long saleId, Long userId) {
		super();
		this.id = id;
		this.watchId = watchId;
		this.saleId = saleId;
		this.userId = userId;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getWatchId() {
		return watchId;
	}

	public void setWatchId(Long watchId) {
		this.watchId = watchId;
	}

	public Long getSaleId() {
		return saleId;
	}

	public void setSaleId(Long saleId) {
		this.saleId = saleId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
	

			
}
