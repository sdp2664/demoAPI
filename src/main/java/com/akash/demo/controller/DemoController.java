package com.akash.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akash.demo.dto.InputDTO;
import com.akash.demo.dto.OutputDTO;
import com.akash.demo.exception.InvalidArgumentException;

import lombok.extern.java.Log;



@RestController
public class DemoController {

	OutputDTO outputDTO = new OutputDTO();
	
	@PostMapping(path="/api/v1/")
	public OutputDTO calculate(@RequestBody InputDTO inputDTO)
	{
		String result;
		double num1 = inputDTO.getNum1();
		double num2 = inputDTO.getNum2();
		
		outputDTO.setNum1(num1);
		outputDTO.setNum2(num2);
		
		try {
			if(num1 == num2)
			{
				outputDTO.setResult("Invalid Input, Numbers can't be equal.");
			}		
			else if(num1<num2)
			{
				result = Double.toString(num2 * 30000 / 3.1415);
				outputDTO.setResult(result);
			}
			else
			{
				result = Double.toString(num1 * 30000 / 3.1415);
				outputDTO.setResult(result);
			}
			return outputDTO;
		}catch(Exception e)
		{
			throw new InvalidArgumentException(e.getMessage());
		}
	}
}
