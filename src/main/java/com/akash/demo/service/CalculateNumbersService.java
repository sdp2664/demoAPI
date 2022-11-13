package com.akash.demo.service;

import org.springframework.stereotype.Component;
import com.akash.demo.exception.InvalidArgumentException;

@Component
public class CalculateNumbersService {
	
	public String calculateNumbers(double num1, double num2)
	{
		String result;
			if(num1 == num2)
			{
				return("Invalid Input, Numbers can't be equal.");
			}		
			else if(num1<num2)
			{
				result = Double.toString(num2 * 30000 / 3.1415);
			}
			else
			{
				result = Double.toString(num1 * 30000 / 3.1415);
			}
			return result;
	}
}
