package com.system2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * <bean id=abc class="com.system2.ABCBank"></bean>
 */
@Configuration
@ComponentScan(basePackages= {"com.system2"})
public class JavaConfig {
	
	@Bean(name="abc")
	public Bank getInstance1() {
		return new ABCBank();
	}
	
	@Bean(name="xyz")
	public Bank getInstance2() {
		return new XYZBank();
	}
 
}
