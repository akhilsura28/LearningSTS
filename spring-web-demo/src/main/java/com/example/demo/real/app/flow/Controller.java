package com.example.demo.real.app.flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/sum")
	public long sum() {
		return 200;
	}
	
}
