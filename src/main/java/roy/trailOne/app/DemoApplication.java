package roy.trailOne.app; // Package declaration.

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication; // Import for running the application.
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import to mark this as a Spring Boot application.
import org.springframework.context.annotation.Bean;

import roy.trailOne.app.run.Location;
import roy.trailOne.app.run.Run;

@SpringBootApplication // Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
                       // annotations.
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
       // log.info("i changed something and God is still helping me always");

    }
    @Bean
    CommandLineRunner runner(){
        return args -> {
           Run run = new Run(1, "1st Run", LocalDateTime.now(), LocalDateTime.now().plus(1,ChronoUnit.HOURS), 5, Location.OUTDOOR);
           log.info("Run: "+ run);
        };
    }
}
