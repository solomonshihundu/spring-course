package com.ss.springcourse.testapp.springapp.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImplementation
{
    private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImplementation()
    {
        logger.info("BEAN CREATION");
    }

    public int binarySearch(int[] numbers,int numToSearch)
    {
        int sortedNum = sortAlgorithm.sort(numbers);

        return sortedNum;
    }

    /**
     * called immediately after bean creation.
     * populate with code that is to be executed only if the bean
     * has been created.
     */
    @PostConstruct
    public void postConstruct()
    {
        logger.info("AFTER BEAN CREATION");
    }

    /**
     * called just before spring removes the bean from the context
     * housekeeping code could be written here
     */
    @PreDestroy
    public void shutdown()
    {
        logger.info("PRE - DESTROY");
    }

    /**
     * spring automatically tries to configures methods named shutdown or close
     * as callback methods as bean is destroyed
     */
    public void close() {
        System.out.println("Closing All Resources");
    }
}
