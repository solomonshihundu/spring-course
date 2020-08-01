package com.ss.springcourse.testapp;

import com.ss.springcourse.testapp.basic.BinarySearchImplementation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = BasicTestApp.class)
public class BinarySearchTest
{
    @Autowired
    BinarySearchImplementation binarySearchImplementation;

    @Test
    public void mostBasicTest()
    {
        assertEquals(999999999,binarySearchImplementation.binarySearch(new int[]{},5));
    }

}
