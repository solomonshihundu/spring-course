package com.ss.springcourse.testapp.cdi;

import com.ss.springcourse.testapp.CdiTestApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 *
 * spring unit test
 * using java context
 *
 */

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = CdiTestApp.class)
public class SampleCdiBusinessTest
{
    @Autowired
    SampleCdiBusiness sampleCdiBusiness;

    @Test
    public void mostBasicTest()
    {
        assertEquals(12,sampleCdiBusiness.findGreatest());
    }

}
