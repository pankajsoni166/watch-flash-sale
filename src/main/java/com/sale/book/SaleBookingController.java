package com.sale.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sale.flashsale.SaleBooking;

@RestController
public class SaleBookingController {

	@Autowired
	private SaleBookingService saleBookingService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/bookWatch")
	public String bookWatch(@RequestBody SaleBooking saleBooking) {
		return saleBookingService.bookWatch(saleBooking);
	}
}
