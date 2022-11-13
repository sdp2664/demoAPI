package com.akash.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;


class CalculateNumbersServiceTest {

	
	CalculateNumbersService calculateNumbersService = new CalculateNumbersService();

	@Test
	void testCalculateNumbers_valid_whenNum1IsGreaterThanNum2() {
		//Given
		double num1 = 25.55;
		double num2 = 15.35;
		//When
		String result = calculateNumbersService.calculateNumbers(num1, num2);
		//Then
		assertEquals("243991.72369886996",result);
	}
	
	@Test
	void testCalculateNumbers_valid_whenNum2IsGreaterThanNum1() {
		//Given
		double num1 = 25.55;
		double num2 = 35.35;
		//When
		String result = calculateNumbersService.calculateNumbers(num1, num2);
		//Then
		assertEquals("337577.59032309405",result);
	}
	
	@Test
	void testCalculateNumbers_invalid_whenBothNumbersAreEqual()
	{
		//Given
		double num1 = 25.55;
		double num2 = 25.55;
		//When
		String result = calculateNumbersService.calculateNumbers(num1,num2);
		//Then
		assertEquals("Invalid Input, Numbers can't be equal.",result);
	}
	


}
