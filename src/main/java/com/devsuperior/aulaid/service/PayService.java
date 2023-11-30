package com.devsuperior.aulaid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class PayService {
	@Autowired
	public TaxService taxServices;
	@Autowired
	public DeliverService deliverServices;	
	
	
	//Construtor
	
	/*public PayService(DeliverService deliverServices, TaxService taxServices) {
		this.taxServices = taxServices;
		this.deliverServices = deliverServices;
	}*/



	// metodo que calcula o preço final, utilizando os metodos das dependencias declaradas.
	public double finalPrice(double cost, String state) {
		return cost + deliverServices.fee(state)+ taxServices.tax(cost);

	}

}
