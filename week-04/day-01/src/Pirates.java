public class Pirates {
    int intoxication;
    int drinkCount;
    boolean awake;
    boolean alive;


    public Pirates() {
        this.intoxication = 5;
        this.awake = true;
        this.alive = true;
    }

    public void drinkSomeRum(){
        if (!this.alive){
            System.out.println("he's dead...");
        } else {
            this.intoxication++;
            drinkCount++;
        }
    }

    public String howsItGoingMate(){
        if (drinkCount < 5) {
            return "Pour me anudder!";
        }
        this.awake = false;
        return "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
    }

    public void die(){
        this.alive = false;
    }

    public void brawl(Pirates pirate){
        int chance = randomGenerator(1,3);
        if (chance == 1){
            pirate.die();
            System.out.println("the one in the brackets died");
        } if (chance == 2){
            this.die();
            System.out.println("the other one died");
        } if (chance == 3){
            this.awake = false;
            pirate.awake = false;
            System.out.println("they both passed out");
        }
    }

    public int randomGenerator(int min, int max){
       return (int)(Math.random() * max + min);
    }
}

