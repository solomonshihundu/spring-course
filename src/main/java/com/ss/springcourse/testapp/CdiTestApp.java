package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.cdi.SampleCdiBusiness;
import com.ss.springcourse.testapp.cdi.SampleCdiDao;
import com.ss.springcourse.testapp.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CdiTestApp {

	private static Logger LOGGER = LoggerFactory.getLogger(CdiTestApp.class);

	public static void main(String[] args)
	{
		ApplicationContext applicationContext = SpringApplication.run(CdiTestApp.class, args);

		SampleCdiBusiness cdiBusiness = applicationContext.getBean(SampleCdiBusiness.class);

//		SampleCdiDao cdiDAO2 = applicationContext.getBean(SampleCdiDao.class);

		LOGGER.info("{}",cdiBusiness.getSampleCdiDao());
	}

}
