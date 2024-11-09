package roy.trailOne.app; // Package declaration.

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication; // Import for running the application.
import org.springframework.boot.autoconfigure.SpringBootApplication; // Import to mark this as a Spring Boot application.

@SpringBootApplication // Combines @Configuration, @EnableAutoConfiguration, and @ComponentScan
                       // annotations.
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        log.info("i changed something and God is still helping me always");

    }
}
