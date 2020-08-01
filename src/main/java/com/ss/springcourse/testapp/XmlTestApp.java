package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(XmlTestApp.class);

	public static void main(String[] args)
	{
		/**
		 * initializing the desired application context
		 * using the config file specified in the ClassPathXmlApplicationContext constructor
		 */
		try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml"))
		{


		/**
		 * bean creation
		 *
		 */
		XmlPersonDAO xmlPersonDAO = applicationContext.getBean(XmlPersonDAO.class);

		XmlPersonDAO xmlPersonDAO2 = applicationContext.getBean(XmlPersonDAO.class);

		LOGGER.info("BEANS LOADED BY SPRING -> {}",(Object) applicationContext.getBeanDefinitionNames());
		LOGGER.info("NO OF BEANS LOADED BY SPRING -> {}",applicationContext.getBeanDefinitionCount());

		LOGGER.info("{}",xmlPersonDAO);
		LOGGER.info("{}",xmlPersonDAO.getXmlJdbcConnection());

		LOGGER.info("{}",xmlPersonDAO2);
		LOGGER.info("{}",xmlPersonDAO2.getXmlJdbcConnection());
		}
	}

}
