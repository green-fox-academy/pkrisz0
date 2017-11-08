package come.greenfox.pkrisz0.guardians.controller;


import come.greenfox.pkrisz0.guardians.model.Arrow;
import come.greenfox.pkrisz0.guardians.model.Fehlermeldung;
import come.greenfox.pkrisz0.guardians.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping(value = "/groot")
    public Object message(@RequestParam(required = false) String message){

        if (message == null) {
            return new Fehlermeldung("I am Groot!");
        } else {
            return new Message(message);
        }
    }

    @GetMapping(value = "/yondu")
    public Object message(@RequestParam(required = false, value = "time") Double time, @RequestParam(required = false, value = "distance") Double distance){
        if (time == null && distance != null) {
            return new Fehlermeldung("Please add a value for time!");
        } if (distance == null && time != null) {
            return new Fehlermeldung("Please add a value for distance!");
        } if (time == null && distance == null) {
            return new Fehlermeldung("When I picked you up as a kid, these boys wanted to eat you. They ain't never tasted Terran before. I saved your life! GIVE SOME PARAMETERS");
        } else {
            return new Arrow(distance, time);
        }
    }
}
