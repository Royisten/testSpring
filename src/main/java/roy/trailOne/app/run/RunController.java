package roy.trailOne.app.run;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/runs")
public class RunController {

   private final RunRepo runRepository;

   public RunController(RunRepo runRepository){
    this.runRepository= runRepository;
   }
    @GetMapping("")
   List<Run> findAll(){
    return runRepository.findAll();
   }
   @GetMapping("/{id}")
   Run findByID(@PathVariable Integer id){
      return runRepository.findByID(id);
   }
 
}
