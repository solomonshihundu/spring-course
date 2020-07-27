package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.basic.BinarySearchImplementation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ss.springcourse.testapp")
public class BasicTestApp
{
	private static Logger LOGGER = LoggerFactory.getLogger(BasicTestApp.class);

	public static void main(String[] args)
	{

		/**
		 * Specifying the application context we wish to run i.e this class
		 */
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(BasicTestApp.class);
		applicationContext.refresh();

		/**
		 * ask spring to create a bean from the specified class
		 * then match its implementation
		 * i.e dependency injection
		 */
		BinarySearchImplementation binarySearchImplementation = applicationContext.getBean(BinarySearchImplementation.class);


		int [] searchPool = new int[]{3,6,7,1,10,7,2};
		int result = binarySearchImplementation.binarySearch(searchPool,1);

		LOGGER.info("RESULT ####  " + result);

		/*
		AnnotationConfigApplicationContext appContext  = new AnnotationConfigApplicationContext();
		appContext.register(BubbleSortAlgo.class);
		appContext.refresh();

		BubbleSortAlgo bubbleSortAlgo = appContext.getBean(BubbleSortAlgo.class);
		LOGGER.info(String.valueOf(bubbleSortAlgo.hashCode()));

		BubbleSortAlgo bubbleSortAlgo2 = appContext.getBean(BubbleSortAlgo.class);
		LOGGER.info(String.valueOf(bubbleSortAlgo2.hashCode()));
		*/


		/**
		 * perform routine housekeeping before destroying bean
		 * this saves on resources and averts memory leaks
		 */
		binarySearchImplementation.shutdown();
	}

}
