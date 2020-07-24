package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ss.springcourse.testapp.componentscan")
public class ComponentTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentTestApp.class);

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(ComponentTestApp.class, args);

		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);

		LOGGER.info("{}",componentDAO);
		LOGGER.info("{}",componentDAO.getComponentJdbcConnection());

		LOGGER.info("{}",componentDAO2);
		LOGGER.info("{}",componentDAO2.getComponentJdbcConnection());
	}

}
