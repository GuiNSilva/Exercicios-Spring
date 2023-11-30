package com.devsuperior.aulaid.service;

import org.springframework.stereotype.Component;

@Component
public class TaxService {
	
	public double tax (double value) {
		return value * 0.1;
	}


}
