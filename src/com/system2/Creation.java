package com.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class Creation implements AccountProcess{

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("AccountCreated");
	}

}
