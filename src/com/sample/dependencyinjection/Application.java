package com.sample.dependencyinjection;

import com.sample.dependencyinjection.interfaces.IApplication;
import com.sample.dependencyinjection.interfaces.IValidator;

public class Application implements IApplication{

	private IValidator validator;
	
	public Application() {
		
	}
	
	public Application(IValidator validator){
		this.validator=validator;
	}
	
	public void setValidator(IValidator validator) {
		this.validator = validator;
	}

	@Override
	public void processValidation(String validateString){
		this.validator.sendMessage(validateString);
	}

}
