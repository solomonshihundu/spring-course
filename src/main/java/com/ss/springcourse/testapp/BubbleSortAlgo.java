package com.ss.springcourse.testapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgo implements SortAlgorithm
{
    public int sort(int[] numbers) {
        return 999999999;
    }
}
