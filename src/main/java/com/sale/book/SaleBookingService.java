package com.sale.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sale.flash.WatchCountService;
import com.sale.flashsale.SaleBooking;

@Service
public class SaleBookingService {
	
	@Autowired
	private SaleBookingRepository saleBookingRepository;
	
	@Autowired
	private WatchCountService watchCountService;
	
	public String bookWatch(SaleBooking saleBooking) {
		boolean userRegisteredForSale = watchCountService.userRegisteredForSale(saleBooking.getUserId(),saleBooking.getSaleId());
		if(userRegisteredForSale) {
			boolean watchCanBeBooked = watchCountService.isWatchCanBeBooked(saleBooking.getSaleId(), saleBooking.getWatchId());
			if(watchCanBeBooked) {
				saleBookingRepository.save(saleBooking);
				
				return "watch booked successfully";
			} else {
				return "Sorry watch is over booked, you are late mate !!!!";
			}
		} else {
			return "User is not registered";
		}
	}
}
