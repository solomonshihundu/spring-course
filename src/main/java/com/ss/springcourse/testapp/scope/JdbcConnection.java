package com.ss.springcourse.testapp.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {

    public JdbcConnection()
    {
        System.out.println("JDBC CONNECTION");
    }
}
