package roy.trailOne.app.run;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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
     Optional<Run>run = runRepository.findByID(id);
     if (run.isEmpty()) {
      throw new ResponseStatusException(HttpStatus.NOT_FOUND);
     }
     return run.get();
   }
   //post method  
   void create( @RequestBody Run run){
      runRepository.create(run);
   }
   //put method

   //delete method
 
}
