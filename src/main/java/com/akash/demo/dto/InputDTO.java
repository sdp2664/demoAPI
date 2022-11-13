package com.akash.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InputDTO {
	
	@JsonProperty("num1")
	private double num1;
	
	@JsonProperty("num2")
	private double num2;


}
