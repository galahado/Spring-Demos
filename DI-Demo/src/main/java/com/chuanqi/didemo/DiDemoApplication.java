package com.chuanqi.didemo;

import com.chuanqi.didemo.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);
        HelloController controller = (HelloController) ctx.getBean("helloController");
        System.out.println(controller.sayHello());

        System.out.println("----- property injected -----");
        PropertyInjController propertyInjController = (PropertyInjController) ctx.getBean("propertyInjController");
        System.out.println(propertyInjController.greeting());

        System.out.println("----- setter injected -----");
        SetterInjController setterInjController = (SetterInjController) ctx.getBean("setterInjController");
        System.out.println(setterInjController.greeting());

        System.out.println("----- constructor injected -----");
        ConstructorInjController constructorInjController = (ConstructorInjController) ctx.getBean("constructorInjController");
        System.out.println(constructorInjController.greeting());

        System.out.println("----- primary controller -----");
        PrimaryController primaryController = (PrimaryController) ctx.getBean("primaryController");
        System.out.println(primaryController.greeting());

        System.out.println("----- profile controller -----");
        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.greeting());
    }

}
