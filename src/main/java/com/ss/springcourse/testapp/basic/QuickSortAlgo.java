package com.ss.springcourse.testapp.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgorithm {

    public int sort(int[] numbers) {
        return 0;
    }
}
