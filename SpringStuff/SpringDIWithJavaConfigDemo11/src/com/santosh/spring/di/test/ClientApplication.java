package com.santosh.spring.di.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.santosh.spring.di.configuration.DIConfiguration;
import com.santosh.spring.di.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Santosh", "santosh@abc.com");
		
		//close the context
		context.close();
	}

}
