package com.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.system2.Bank;
import com.system2.JavaConfig;

public class MainProgram2 {
	public static void main(String n[]) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(JavaConfig.class);
		Bank b=(Bank)ac.getBean("abc");
		b.establish();
		b=(Bank)ac.getBean("xyz");
		b.establish();
	}

}
