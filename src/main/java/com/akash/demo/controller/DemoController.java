package com.akash.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/api/v1")
public class DemoController {

	@PostMapping(path="/api/v1/{n1}/{n2}")
	public double calculate(@PathVariable double n1, @PathVariable double n2)
	{
		double result;
		if(n1<n2)
		{
			result = n2 * 30000/3.1415;
		}
		else
			result = n1 * 30000/3.1415;
		
		return result;
	}
}
