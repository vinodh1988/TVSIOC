package com.system2;

import org.springframework.stereotype.Component;

@Component
public class BranchCreator implements Branch {

	@Override
	public void start(String n) {
		// TODO Auto-generated method stub
		System.out.println(n+"  Branch started");
	}
	
 
}
