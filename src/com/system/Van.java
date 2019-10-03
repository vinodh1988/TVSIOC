package com.system;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class Van implements Vehicle {

	Model m;
	@Autowired
	Marketing vmr;
	
	@PostConstruct
	public void runit() {
		System.out.println("Object created and constructed...VAN");
	}
	
	
	public Van(Model m) {
		super();
		this.m = m;
	}



	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Van Details...!!!!");
		m.model();
		m.design();
		vmr.advertise();
	}

}
