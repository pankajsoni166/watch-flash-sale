package com.sale.flashsale;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class WatchCount {
	
	@Id
	private long id;
	private long saleId;
	private long watchId;
	private long totalCountOfWatchForSale;
	private long countOfWatchesBooked;
	
	public WatchCount() {
		super();
	}
	
	public WatchCount(long id, long saleId, long watchId, long totalCountOfWatchForSale, long countOfWatchesBooked) {
		super();
		this.id = id;
		this.saleId = saleId;
		this.watchId = watchId;
		this.totalCountOfWatchForSale = totalCountOfWatchForSale;
		this.countOfWatchesBooked = countOfWatchesBooked;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getSaleId() {
		return saleId;
	}
	public void setSaleId(long saleId) {
		this.saleId = saleId;
	}
	public long getWatchId() {
		return watchId;
	}
	public void setWatchId(long watchId) {
		this.watchId = watchId;
	}
	public long getTotalCountOfWatchForSale() {
		return totalCountOfWatchForSale;
	}
	public void setTotalCountOfWatchForSale(long totalCountOfWatchForSale) {
		this.totalCountOfWatchForSale = totalCountOfWatchForSale;
	}
	public long getCountOfWatchesBooked() {
		return countOfWatchesBooked;
	}
	public void setCountOfWatchesBooked(long countOfWatchesBooked) {
		this.countOfWatchesBooked = countOfWatchesBooked;
	}
	
	
}
