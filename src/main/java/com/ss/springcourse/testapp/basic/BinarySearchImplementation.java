package com.ss.springcourse.testapp.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImplementation
{
    @Autowired
    @Qualifier("bubble")
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int[] numbers,int numToSearch)
    {
        int sortedNum = sortAlgorithm.sort(numbers);

        return sortedNum;
    }
}
