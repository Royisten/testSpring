package roy.trailOne.app.run;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import jakarta.validation.Valid;

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

   //notify if a new post request is accepted (201 CREATED)
   @ResponseStatus(HttpStatus.CREATED)
   //post request method  
   @PostMapping("")
   void create(@Valid @RequestBody Run run){
      runRepository.create(run);
   }


   //put request method
   @ResponseStatus(HttpStatus.NO_CONTENT)
   @PutMapping("/{id}")
   void update(@Valid @RequestBody Run run, @PathVariable Integer id){
      runRepository.update(run, id);
   }



   //delete request method
   @ResponseStatus(HttpStatus.GONE)
   @DeleteMapping("/{id}")
   void delete(@PathVariable Integer id){
      runRepository.delete(id);
   }
 
}
