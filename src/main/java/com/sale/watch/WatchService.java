package com.sale.watch;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sale.flashsale.MyWatch;

@Service
public class WatchService {
	
	@Autowired
	private WatchRepository watchRepository;
	
	public List<MyWatch> getAllWatch(){
		List<MyWatch> allWatches = new ArrayList<>();
		watchRepository.findAll()
		.forEach(allWatches::add);
		return allWatches;
	}
	
	public void addAllWatch(List<MyWatch> watches) {
		watchRepository.saveAll(watches);
	}
}
