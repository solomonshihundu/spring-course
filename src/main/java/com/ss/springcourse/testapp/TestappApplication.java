package com.ss.springcourse.testapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestappApplication {

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(TestappApplication.class, args);
		BinarySearchImplementation binarySearchImplementation = applicationContext.getBean(BinarySearchImplementation.class);
		System.out.println("#####################"+binarySearchImplementation);
		int [] searchPool = new int[]{3,6,7,1,10,7,2};
		int result = binarySearchImplementation.binarySearch(searchPool,1);
		System.out.println(result);
	}

}
