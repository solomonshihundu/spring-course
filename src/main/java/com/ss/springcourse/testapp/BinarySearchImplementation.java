package com.ss.springcourse.testapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImplementation
{
    @Autowired
    private SortAlgorithm sortAlgorithm;

    public BinarySearchImplementation(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers,int numToSearch)
    {
        int sortedNum = sortAlgorithm.sort(numbers);

        return sortedNum;
    }
}
