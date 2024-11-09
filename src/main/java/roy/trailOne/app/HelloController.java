package roy.trailOne.app; // Package declaration - organizes the class into a namespace structure.

import org.springframework.web.bind.annotation.GetMapping; // Import for mapping HTTP GET requests.
import org.springframework.web.bind.annotation.RestController; // Import to define this class as a RESTful controller.

@RestController // Marks the class as a controller where every method returns a domain object
                // instead of a view.
public class HelloController {
    @GetMapping("/hello") // Maps HTTP GET requests to the `/hello` URL path to this method.
    public String hello() {
        return "god help!"; // Returns a simple response when the endpoint is hit.
    }
}
