package roy.trailOne.app; // Package declaration for the test class.

import org.junit.jupiter.api.Test; // Import for defining test methods.
import org.springframework.boot.test.context.SpringBootTest; // Import to indicate a Spring Boot test.

@SpringBootTest // Tells Spring to load the application context for integration tests.
class DemoApplicationTests {

    @Test // Marks the method as a test method.
    void contextLoads() {
        // This test checks if the application context loads without any issues.
    }
}
