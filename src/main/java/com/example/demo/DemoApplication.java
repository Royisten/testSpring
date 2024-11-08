package com.example.demo; // Package declaration.

import org.springframework.boot.SpringApplication; // Import for running the application.
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import to mark this as a Spring Boot application.

import triailrun.sample;

@SpringBootApplication // Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
                       // annotations.
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args); // Launches the Spring Boot application.
        var welcomeMsg= new sample();
        System.out.println(welcomeMsg.getsample());
    }
}
