package com.akash.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class OutputDTO {
	
	@JsonProperty("n1")
	private double n1;
	
	@JsonProperty("n2")
	private double n2;

	@JsonProperty("result")
	private double result;

}
