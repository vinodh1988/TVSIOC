package com.system;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

public class LuxuryCar implements Vehicle {

Model m;

List<Extras> extras;

@Autowired
Marketing cmr;

@PostConstruct
public void runit() {
	System.out.println("Object created and constructed...LUXURY CAR");
}

	public Model getM() {
	return m;
}


public void setM(Model m) {
	this.m = m;
}



	public List<Extras> getExtras() {
	return extras;
}

public void setExtras(List<Extras> extras) {
	this.extras = extras;
}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Car..!!!!");
		m.model();
		m.design();
		cmr.advertise();
		for(Extras e:extras)
			e.add();
	}

}
