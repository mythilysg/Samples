package com.sample.dependencyinjection.test;

import org.junit.Before;
import org.junit.Test;

import com.sample.dependencyinjection.Application;
import com.sample.dependencyinjection.interfaces.IApplication;
import com.sample.dependencyinjection.interfaces.IApplicationContext;
import com.sample.dependencyinjection.interfaces.IValidator;

public class DIJUnitTest {

	private IApplicationContext appContext;
	
	@Before
	public void setUp(){
	
		appContext = new IApplicationContext() {
			@Override
			public IApplication getApplication() {
				return new Application(new IValidator() {
				
					@Override
					public void sendMessage(String message) {
						System.out.println(" Validation message "+message);
						
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		IApplication app = appContext.getApplication();
		app.processValidation("Validation success");
	}
	
}
