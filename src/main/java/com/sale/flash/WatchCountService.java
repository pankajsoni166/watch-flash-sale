package com.sale.flash;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sale.flashsale.UserSaleRegistration;
import com.sale.flashsale.WatchCount;
import com.sale.saleRegistration.SaleRegistrationRepository;

@Service
public class 
WatchCountService {

	@Autowired
	private WatchCountRepository watchCountRepository;
	
	@Autowired
	private SaleRegistrationRepository saleRegistrationRepository;
	
	public void saveWatchCount(WatchCount watchCount) {
		watchCountRepository.save(watchCount);
	}
	
	public boolean isWatchCanBeBooked(Long saleId, Long watchId) {
		WatchCount watchCount = watchCountRepository.findBySaleIdAndWatchId(saleId, watchId);
		if(watchCount == null) {
			return false;
		}
		Long totalCountOfWatchForSale = watchCount.getTotalCountOfWatchForSale();
		Long bookedWatches = watchCount.getCountOfWatchesBooked();
		boolean isWatchCanBeBooked = false;
		if(bookedWatches >= totalCountOfWatchForSale) {
			isWatchCanBeBooked = false;
		} else {
			isWatchCanBeBooked = true;
		}
		if(isWatchCanBeBooked) {
			//if the call comes here, it means watch is 
			//going to get booked, So reduce the booked watch count
			
			reduceBookedCount(watchCount);
		}
		return isWatchCanBeBooked;
	}

	private void reduceBookedCount(WatchCount watchCount) {
		
		watchCount.setCountOfWatchesBooked(watchCount.getCountOfWatchesBooked()+1);
		watchCountRepository.save(watchCount);
	}

	public List<WatchCount> getWatchCount() {
		List<WatchCount> watchCounts = new ArrayList<WatchCount>();
		watchCountRepository.findAll().forEach(watchCounts::add);
		return watchCounts;
	}

	public boolean userRegisteredForSale(Long userId, Long saleId) {
		UserSaleRegistration userSaleRegistration = saleRegistrationRepository.findBySaleIdAndUserId(saleId, userId);
		if(userSaleRegistration != null) {
			return true;
		} else {
			return false;
		}
	}
}
