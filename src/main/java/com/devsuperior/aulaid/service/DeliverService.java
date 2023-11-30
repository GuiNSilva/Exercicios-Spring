package com.devsuperior.aulaid.service;

import org.springframework.stereotype.Component;

@Component
public class DeliverService {
	public double fee(String state) {
		if("SP".equalsIgnoreCase(state)) {
			return 10.0;
		}
		else {
			return 20.0;
		}
	}

}
