package com.sale.flash;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sale.flashsale.WatchCount;

@RestController
public class WatchCountController {

	@Autowired
	private WatchCountService watchCountService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/watchCountForSale")
	public void saveWatchCount(@RequestBody WatchCount watchCount) {
		watchCountService.saveWatchCount(watchCount);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/watchCountForSale")
	public List<WatchCount> getWatchCount() {
		return watchCountService.getWatchCount();
	}
	
}
