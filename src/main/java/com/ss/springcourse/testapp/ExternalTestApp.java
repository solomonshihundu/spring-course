package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.componentscan.ComponentDAO;
import com.ss.springcourse.testapp.properties.ExternalTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:testapp.properties")
public class ExternalTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(ExternalTestApp.class);

	public static void main(String[] args)
	{
		/**
		 * initializing the desired application context
		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(ExternalTestApp.class);
		applicationContext.refresh();

		/**
		 * bean creation
		 *
		 */
		ExternalTestService service = applicationContext.getBean(ExternalTestService.class);

		LOGGER.info("{}",service);
		LOGGER.info("{}",service.returnServiceUrl());
	}

}
