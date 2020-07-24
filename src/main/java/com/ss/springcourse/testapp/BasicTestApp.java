package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.springapp.basic.BinarySearchImplementation;
import com.ss.springcourse.testapp.springapp.basic.BubbleSortAlgo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class BasicTestApp
{
	private static Logger LOGGER = LoggerFactory.getLogger(BasicTestApp.class);

	public static void main(String[] args)
	{

		ApplicationContext applicationContext = SpringApplication.run(BasicTestApp.class, args);
		BinarySearchImplementation binarySearchImplementation = applicationContext.getBean(BinarySearchImplementation.class);

		int [] searchPool = new int[]{3,6,7,1,10,7,2};
		int result = binarySearchImplementation.binarySearch(searchPool,1);

		LOGGER.info("RESULT ####  " + result);

		AnnotationConfigApplicationContext appContext  = new AnnotationConfigApplicationContext();
		appContext.register(BubbleSortAlgo.class);
		appContext.refresh();

		BubbleSortAlgo bubbleSortAlgo = appContext.getBean(BubbleSortAlgo.class);
		LOGGER.info(String.valueOf(bubbleSortAlgo.hashCode()));

		BubbleSortAlgo bubbleSortAlgo2 = appContext.getBean(BubbleSortAlgo.class);
		LOGGER.info(String.valueOf(bubbleSortAlgo2.hashCode()));

		appContext.close();

		LOGGER.info("WE SHOULD NEVER GET HERR");

	}

}
