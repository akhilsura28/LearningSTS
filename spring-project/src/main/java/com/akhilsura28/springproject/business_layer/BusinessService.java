package com.akhilsura28.springproject.business_layer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.akhilsura28.springproject.dataservice.DataService;

@Component
public class BusinessService {

	@Autowired
	private DataService dataService;
	
	public long calculateSum() {
		return dataService.getData();
	}
}

