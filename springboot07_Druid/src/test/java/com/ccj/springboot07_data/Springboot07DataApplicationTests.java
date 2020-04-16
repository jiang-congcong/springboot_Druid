package com.ccj.springboot07_data;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot07DataApplicationTests {

    @Autowired
    DataSource dataSource;


    @Test
    public void contextLoads() {
        System.out.println(dataSource.getClass());
    }

}
