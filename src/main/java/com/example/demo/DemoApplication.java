package com.example.demo; // Package declaration.

import org.springframework.boot.SpringApplication; // Import for running the application.
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import to mark this as a Spring Boot application.
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication // Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
                       // annotations.
public class DemoApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args); 
        sample welcomeMsg = (sample) context.getBean("sample");
        System.out.println(welcomeMsg.getsample());


    }
}
