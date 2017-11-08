package come.greenfox.pkrisz0.guardians.controller;


import come.greenfox.pkrisz0.guardians.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @Autowired
    Ship ship;

    @GetMapping(value = "/groot")
    public Object groot(@RequestParam(required = false) String message){

        if (message == null) {
            return new Fehlermeldung("I am Groot!");
        } else {
            return new Message(message);
        }
    }

    @GetMapping(value = "/yondu")
    public Object yondu(@RequestParam(required = false, value = "time") Double time, @RequestParam(required = false, value = "distance") Double distance){
        if (time == null) {
            return new Fehlermeldung("Please add a value for time!");
        } else if (distance == null) {
            return new Fehlermeldung("Please add a value for distance!");
        } else if (time == null && distance == null) {
            return new Fehlermeldung("When I picked you up as a kid, these boys wanted to eat you. They ain't never tasted Terran before. I saved your life! GIVE SOME PARAMETERS");
        } else {
            return new Arrow(distance, time);
        }
    }

    @GetMapping(value = "/rocket")
    public Ship cargoCheck(){
        return ship;
    }

    @GetMapping(value = "/rocket/fill")
    public Fill rocketFill(@RequestParam (value = "caliber") String caliber, @RequestParam (value = "amount") int amount){
        ship.fill(caliber, amount);
        return new Fill(caliber, amount, ship.getShipstatus(), ship.isReady());
    }
}
