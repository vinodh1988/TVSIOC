package com.system2;

import org.springframework.beans.factory.annotation.Autowired;

public class XYZBank implements Bank {

	@Autowired
	Branch b;
	@Override
	public void establish() {
		// TODO Auto-generated method stub
		System.out.println("XYZBank is registered and established");
		b.start("Chennai");
		b.start("Mumbai");
	}

}
