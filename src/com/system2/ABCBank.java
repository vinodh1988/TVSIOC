package com.system2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class ABCBank implements Bank {
	@Autowired
	Branch branch;
	
	@Autowired
	List<AccountProcess> lp;

	@Override
	public void establish() {
		// TODO Auto-generated method stub
		System.out.println("ABCBank established");
		branch.start("Bangalore");
		branch.start("Chennai");
		branch.start("Delhi");
		for(AccountProcess p:lp) 
			p.task();
	}

}
