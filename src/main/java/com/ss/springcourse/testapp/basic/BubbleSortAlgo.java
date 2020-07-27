package com.ss.springcourse.testapp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
@Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSortAlgo implements SortAlgorithm
{
    public int sort(int[] numbers) {
        return 999999999;
    }
}
