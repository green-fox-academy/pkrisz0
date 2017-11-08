package come.greenfox.pkrisz0.guardians.controller;


import come.greenfox.pkrisz0.guardians.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class GuardianController {

    @Autowired
    Ship ship;

    @Autowired
    FoodTable foodtable;

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

    @GetMapping(value = "/drax")
    public List<Food> draxList(){
        return foodtable;
    }

    @PutMapping (value = "/drax/add")
    public List<Food> addFood(
            @RequestParam (value = "foodName", required = false) String foodName,
            @RequestParam (value = "foodAmount") int foodAmount,
            @RequestParam (value = "foodCalorie") int foodCalorie
    ){
        foodtable.add(new Food(foodName,foodAmount,foodCalorie, foodtable.size() + 1));
        return foodtable;
    }

    @DeleteMapping(value = "/drax/remove")
    public Object removeFood(@RequestParam (value = "foodId", required = false) int foodId){
        if (foodtable.containsById(foodId - 1) == true) {
            foodtable.remove(foodId - 1);
            return foodtable;
        } else {
            return new Fehlermeldung("No food with this id among Drax Foods");
        }
    }

    @PutMapping (value = "/drax/editfood")
    public Object editFood(
            @RequestParam (value = "foodId", required = false) int foodId,
            @RequestParam (value = "foodCalorie") int foodCalorie
    ){
        if (foodtable.containsById(foodId) == true) {
            foodtable.get(foodId - 1).setFoodCalorie(foodCalorie);
            return foodtable;
        } else {
            return new Fehlermeldung("No food wid this id among Drax Foods");
        }
    }
}
