package com.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(2)
public class Verify implements AccountProcess {

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Customer Verified");
	}

}
