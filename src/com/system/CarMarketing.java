package com.system;

import org.springframework.stereotype.Component;

@Component("cmr")
public class CarMarketing implements Marketing {

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Car is marketed..!!!");
	}

}
