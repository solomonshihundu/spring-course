package com.ss.springcourse.testapp.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SampleCdiBusiness
{
    @Inject
    SampleCdiDao sampleCdiDao ;

    public SampleCdiDao getSampleCdiDao() {
        return sampleCdiDao;
    }

    public void setSampleCdiDao(SampleCdiDao sampleCdiDao) {
        this.sampleCdiDao = sampleCdiDao;
    }
}
