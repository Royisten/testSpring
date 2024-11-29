package roy.trailOne.app.run;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;

//import java.time.LocalDateTime;
//import java.time.temporal.ChronoUnit;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;

import org.springframework.stereotype.Repository;

//import jakarta.annotation.PostConstruct;
@Repository
public class RunRepo {
    private static final Logger log = LoggerFactory.getLogger(RunRepo.class);
    private final JdbcClient jdbcClient;

    public RunRepo(JdbcClient jdbcClient){
        this.jdbcClient=jdbcClient;
    }
    public List<Run> findAll(){
        return jdbcClient.sql("select * from run")
        .query(Run.class)
        .list();
    }

    /*private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }
    Optional<Run> findByID(Integer id){
        return runs.stream().
            filter(run->run.id()==id).
            findFirst();
    }
    void create(Run run){
        runs.add(run);
    }
    void update(Run run, Integer id){
        Optional<Run> existingRun = findByID(id);
        if (existingRun.isPresent()) {
            runs.set(runs.indexOf(existingRun.get()), run);
        }
    }
    void delete(Integer id){
        runs.removeIf(run->run.id().equals(id));
    }
    @PostConstruct
    private void init() {
        runs.add(new Run(1,
        "Monday morning run",
        LocalDateTime.now(),
        LocalDateTime.now().plus(1, ChronoUnit.HOURS),
        2,
        Location.OUTDOOR));

        runs.add(new Run(2,
        "Monday Evening run",
        LocalDateTime.now().plus(8, ChronoUnit.HOURS),
        LocalDateTime.now().plus(9 , ChronoUnit.HOURS),
        1,
        Location.OUTDOOR));
    }*/
}
