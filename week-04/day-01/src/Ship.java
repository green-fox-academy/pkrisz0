import java.util.ArrayList;

public class Ship extends ArrayList<Pirates> {
    Pirates one;
    int initialCapacity;
    int crewCount;
    Captain jack;

    public Ship() {
        one = new Pirates();
        this.initialCapacity = one.randomGenerator(0,20);
        this.crewCount = 0;
        jack = new Captain();
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
        System.out.println("The Ship has " + this.crewCount + " Pirates, " + this.countAlive() +
                " of them are still alive.\n The Captain\'s intoxication level is currently at " +
                this.captainRum() + " he is " + this.captainStatus());
    }
}
