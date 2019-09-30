package com.sale.flash;

import org.springframework.data.repository.CrudRepository;

import com.sale.flashsale.WatchCount;

public interface WatchCountRepository extends CrudRepository<WatchCount, Long>{
	public WatchCount findBySaleIdAndWatchId(Long saleId, Long watchId);
}
