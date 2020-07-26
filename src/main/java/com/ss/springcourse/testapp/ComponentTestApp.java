package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ss.springcourse.testapp.componentscan")
public class ComponentTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentTestApp.class);

	public static void main(String[] args)
	{
		/**
		 * initializing the desired application context
		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(ComponentTestApp.class);
		applicationContext.refresh();

		/**
		 * bean creation
		 *
		 */
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",componentDAO);
		LOGGER.info("{}",componentDAO.getComponentJdbcConnection());

		LOGGER.info("{}",componentDAO2);
		LOGGER.info("{}",componentDAO2.getComponentJdbcConnection());
	}

}
