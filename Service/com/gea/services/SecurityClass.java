package com.gea.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("securityObj")
public class SecurityClass {
	
	@Autowired
	private WelcomeServices services;
	
	public void validateRequest() {
		System.out.println("iin request....");
		services.processRequest();

	}

}
