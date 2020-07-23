package com.ss.springcourse.testapp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgorithm
{
    public int sort(int[] numbers) {
        return 999999999;
    }
}
