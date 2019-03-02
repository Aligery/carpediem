package endpoint;

import dto.Data;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Workout {

    @RequestMapping("/workout")
    public Workout getData() {

        return new Data();
    }
}