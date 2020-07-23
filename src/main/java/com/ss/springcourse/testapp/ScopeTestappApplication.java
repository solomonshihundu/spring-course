package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.basic.BinarySearchImplementation;
import com.ss.springcourse.testapp.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ScopeTestappApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(ScopeTestappApplication.class);

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(ScopeTestappApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		System.out.println("##################### "+personDAO);

		System.out.println("#####################  "+personDAO.getJdbcConnection());

		System.out.println("#####################  "+personDAO2);

		System.out.println("#####################  "+personDAO2.getJdbcConnection());

		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcConnection());

		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConnection());
	}

}
