package com.chuanqi.properties_demo;

import com.chuanqi.properties_demo.model.DataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertiesDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(PropertiesDemoApplication.class, args);
        DataSource dataSource = (DataSource) ctx.getBean(DataSource.class);

        System.out.println(dataSource.getUsername());
        System.out.println(dataSource.getPassword());
        System.out.println(dataSource.getUrl());
    }

}
