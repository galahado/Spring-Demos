package com.chuanqi.factorybeandemo;

import com.chuanqi.factorybeandemo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FactorybeanDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(FactorybeanDemoApplication.class, args);
        GreetingController greetingController = ctx.getBean(GreetingController.class);
        System.out.println(greetingController.greeting());
    }

}
