/**
 * 
 */
package com.system2;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author kcvin
 *
 */

@Component
@Order(1)
public class Register implements AccountProcess {

	@Override
	public void task() {
		// TODO Auto-generated method stub
		System.out.println("Customer Registered");
	}

}
