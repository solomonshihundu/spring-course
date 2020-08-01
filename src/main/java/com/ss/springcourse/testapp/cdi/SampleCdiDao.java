package com.ss.springcourse.testapp.cdi;

import javax.inject.Named;

@Named
public class SampleCdiDao
{
    public int[]getData()
    {
        return new int[]{5,6,12,9};
    }

}
