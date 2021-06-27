package com.akhilsura28.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.akhilsura28.springproject.business_layer.BusinessService;

@RestController
public class MyController {

	@Autowired
	private BusinessService businessService;
	
	@GetMapping("/sum")
	public long sum() {
		return businessService.calculateSum();
	}
	
}
