package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.system.Vehicle;

public class MainProgram {
    public static void main(String[] args) {
    	ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
    	Vehicle v=(Vehicle)ac.getBean("car");
    	System.out.println(v.hashCode());
    	v=(Vehicle)ac.getBean("car");
    	System.out.println(v.hashCode());
    	v.showDetails();
    	v=(Vehicle)ac.getBean("van");
    	v.showDetails();
    	System.out.println(v.hashCode());
	}
}
