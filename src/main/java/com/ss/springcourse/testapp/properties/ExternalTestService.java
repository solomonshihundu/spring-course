package com.ss.springcourse.testapp.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ExternalTestService
{
    @Value("${external.service.url}")
    private String serviceUrl;

    public String returnServiceUrl()
    {
    return serviceUrl;
    }
}
