package roy.trailOne.app.run;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RunController {

   private final RunRepo runRepository;

   public RunController(RunRepo runRepository){
    this.runRepository= runRepository;
   }
    
   List<Run> findAll(){
    return null;
   }

}
