package com.akash.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.demo.dto.InputDTO;
import com.akash.demo.dto.OutputDTO;

import lombok.extern.java.Log;



@RestController
public class DemoController {

	OutputDTO outputDTO = new OutputDTO();
	
	@PostMapping(path="/api/v1/")
	public OutputDTO calculate(@RequestBody InputDTO inputDTO)
	{
		double num1 = inputDTO.getN1();
		double num2 = inputDTO.getN2();
		
		outputDTO.setN1(num1);
		outputDTO.setN2(num2);
		
		if(num1<num2)
		{
			outputDTO.setResult(num2 * 30000 / 3.1415);
		}
		else
		{
			outputDTO.setResult(num1 * 30000 / 3.1415);
		}
		return outputDTO;
	}
}
