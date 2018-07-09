package com.santosh.spring.di.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.santosh.spring.di.services.EmailService;
import com.santosh.spring.di.services.MessageService;

@Configuration
@ComponentScan(value={"com.santosh.spring.di.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
