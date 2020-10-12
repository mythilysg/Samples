package com.sample.dependencyinjection.injector;

import com.sample.dependencyinjection.Application;
import com.sample.dependencyinjection.interfaces.IApplication;
import com.sample.dependencyinjection.interfaces.IApplicationContext;
import com.sample.dependencyinjection.service.EmailValidator;

public class EmailContext implements IApplicationContext {

	@Override
	public IApplication getApplication() {
		Application app = new Application();
		app.setValidator(new EmailValidator());
		return app;
	}

}
