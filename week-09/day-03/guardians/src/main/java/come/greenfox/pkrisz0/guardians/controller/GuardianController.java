package come.greenfox.pkrisz0.guardians.controller;


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
}
