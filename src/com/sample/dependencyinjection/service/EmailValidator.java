package com.sample.dependencyinjection.service;

import com.sample.dependencyinjection.interfaces.IValidator;

public class EmailValidator implements IValidator {

	@Override
	public void sendMessage(String message) {
		System.out.println("Status of email "+message);
	}

}
