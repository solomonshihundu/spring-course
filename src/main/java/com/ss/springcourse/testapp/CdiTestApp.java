package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.cdi.SampleCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class CdiTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiTestApp.class);

	public static void main(String[] args)
	{
		/**
		 * initializing application context
		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(CdiTestApp.class);
		applicationContext.refresh();

		/**
		 * bean creation
		 */
		SampleCdiBusiness cdiBusiness = applicationContext.getBean(SampleCdiBusiness.class);

//		SampleCdiDao cdiDAO2 = applicationContext.getBean(SampleCdiDao.class);

		LOGGER.info("{}",cdiBusiness.getSampleCdiDao());
	}

}
