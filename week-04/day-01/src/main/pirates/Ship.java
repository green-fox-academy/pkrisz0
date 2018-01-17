package main.java.pirates;

import java.util.ArrayList;

public class Ship extends ArrayList<Pirates> {
    Pirates one;
    int initialCapacity;
    int crewCount;
    Captain jack;
    String name;

    public Ship() {
        one = new Pirates();
        this.initialCapacity = one.randomGenerator(0,20);
        this.crewCount = 0;
        jack = new Captain();
    }

    public Ship(String name) {
        one = new Pirates();
        this.initialCapacity = one.randomGenerator(0,20);
        this.crewCount = 0;
        jack = new Captain();
        this.name = name;
    }

    public void fillShip(){
        for (int i = 0; i < this.initialCapacity; i++) {
            add(new Pirates());
            this.crewCount++;
        }
    }
    public int countAlive(){
        int alive = 0;
        for (int i = 0; i < this.crewCount; i++) {
            if (this.get(i).alive){
                alive++;
            }
        } return alive;
    }

    public int captainRum(){
       return this.jack.intoxication;
    }

    public String captainStatus(){
        if (this.jack.alive && this.jack.awake) {
            return "both alive and awake.";
        } else if (!this.jack.alive) {
            return "quite dead.";
        } else if (this.jack.alive && !this.jack.awake){
            return "alive, but not awake.";
        }
        return "404 - captain not found";
    }

    public void introduce(){
        System.out.println("The Ship " + this.name + " has " + this.crewCount + " Pirates, " + this.countAlive() +
                " of them are still alive.\n The Captain\'s intoxication level is currently at " +
                this.captainRum() + " he is " + this.captainStatus());
    }

    public boolean battle(Ship other){
        int rumCount = 0;
        if ((this.countAlive() - this.captainRum()) > ((other.countAlive() - other.captainRum()))){
            war(this, other);
            return true;
        } else {
            war(other, this);
        }
        return false;
    }

    public void war(Ship winning, Ship losing){
        int rumCount = 0;
        for (int i = 0; i < one.randomGenerator(0,losing.crewCount); i++) {
            losing.get(i).die();
        }
        for (int j = 0; j < winning.crewCount; j++) {
            for (int i = 0; i < one.randomGenerator(1, 5) ; i++) {
                winning.get(j).drinkSomeRum();
                rumCount++;
            }

        }
        System.out.println("The ship " + losing.name + " has lost the battle and " + (losing.crewCount - losing.countAlive()) + " Pirate(s).\n " +
                "The winning ship, " + winning.name + " has earned " + rumCount + " shots of celebratory rum.");
    }
}


//    Ships should have a method to battle other ships: ship.battle(otherShip)
//        should return true if the actual ship (this) wins
//        the ship should win if its calculated score is higher
//        calculate score: Number of Alive main.java.pirates in the crew - Number of consumed rum by the captain
//        The loser crew has a random number of losses (deaths).
//        The winner captain and crew has a party, including a random number of rum :)

