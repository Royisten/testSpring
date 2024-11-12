package roy.trailOne.app.run;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

   private final RunRepo runRepository;

   public RunController(RunRepo runRepository){
    this.runRepository= runRepository;
   }
    @GetMapping("/api/runs")
   List<Run> findAll(){
    return runRepository.findAll();
   }

}
