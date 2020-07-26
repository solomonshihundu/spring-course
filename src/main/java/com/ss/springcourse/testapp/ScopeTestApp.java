package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.springapp.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
public class ScopeTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeTestApp.class);

	public static void main(String[] args)
	{
		/**
		 * application context initialization
		 */
		try(AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext())
		{
			applicationContext.register(ScopeTestApp.class);
			applicationContext.refresh();

			/**
			 * dao bean creation
			 */
			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDAO);
			LOGGER.info("{}", personDAO.getJdbcConnection());

			LOGGER.info("{}", personDAO2);
			LOGGER.info("{}", personDAO2.getJdbcConnection());
		}

	}

}
