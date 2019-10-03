package com.system;

import org.springframework.stereotype.Component;

@Component("vmr")
public class VanMarketing implements Marketing {

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Van is advertised");
	}

}
