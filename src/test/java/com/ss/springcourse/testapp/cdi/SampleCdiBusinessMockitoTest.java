package com.ss.springcourse.testapp.cdi;

import com.ss.springcourse.testapp.CdiTestApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


/**
 * spring unit test
 * using mockito
 *
 */

@RunWith(MockitoJUnitRunner.class)
public class SampleCdiBusinessMockitoTest
{

    @Mock
    SampleCdiDao sampleCdiDaoMock;

    @InjectMocks
    SampleCdiBusiness sampleCdiBusiness;

    @Test
    public void mostBasicTest()
    {

        Mockito.when(sampleCdiDaoMock.getData()).thenReturn(new int[]{12,56,80});
        assertEquals(80,sampleCdiBusiness.findGreatest());
    }

}
