package com.sale.watch;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sale.flashsale.MyWatch;

@RestController
public class WatchController {
	
	@Autowired
	private WatchService watchService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/watches")
	public List<MyWatch> getAllWatches(){
		return watchService.getAllWatch();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/watches")
	public void addAllWatches(@RequestBody List<MyWatch> watches) {
		watchService.addAllWatch(watches);
	}
	
}
