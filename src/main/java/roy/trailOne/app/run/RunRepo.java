package roy.trailOne.app.run;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;
@Repository
public class RunRepo {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    }
    Optional<Run> findByID(Integer id){
        return runs.stream().
            filter(run->run.id()==id).
            findFirst();
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
    }
}
