package com.ss.springcourse.testapp.componentscan;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ComponentJdbcConnection {

    public ComponentJdbcConnection()
    {
        System.out.println("\n COMPONENT JDBC CONNECTION");
    }
}
