package com.akash.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.demo.dto.InputDTO;
import com.akash.demo.dto.OutputDTO;
import com.akash.demo.service.CalculateNumbersService;

@RestController
public class DemoController {
	
	@Autowired
	CalculateNumbersService calculateNumbersService;
	
	OutputDTO outputDTO = new OutputDTO();
	
	@PostMapping(path="/api/v1/")
	public OutputDTO calculate(@RequestBody InputDTO inputDTO)
	{
		outputDTO.setNum1(inputDTO.getNum1());
		outputDTO.setNum2(inputDTO.getNum2());
		outputDTO.setResult(calculateNumbersService.calculateNumbers(inputDTO.getNum1(),inputDTO.getNum2()));
		return outputDTO;
	}
}
