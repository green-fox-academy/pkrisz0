import java.util.ArrayList;

public class Vegetation {
    String name;
    int currentWater;
    ArrayList<Vegetation> vegetations;
    double absorb;
    int waterAmount;

    //constructor
    public Vegetation(String name) {
        this.name = name;
        this.currentWater = 0;
        this.vegetations = new ArrayList<Vegetation>();
    }

    //add Trees / Flowers
    public void addVeg(Vegetation vegetation) {
        vegetations.add(vegetation);
    }

    //print the garden
    public void display() {

        for (int i = 0; i < vegetations.size(); i++) {
            if(vegetations.get(i) instanceof Flower){
                System.out.println("The " + vegetations.get(i).name + " Flower " + vegetations.get(i).checkThirst());
            } else {
                System.out.println("The " + vegetations.get(i).name + " Tree " + vegetations.get(i).checkThirst());
            }
        }
    }

    //check thirst
    public String checkThirst() {
        if (currentWater < 5) {
            return "needs water";
        } else {
            return "doesnt need water";
        }
    }


    public void water(int waterAmount) {
        System.out.println("\n" + "Watering with " + waterAmount);
        //how many need watering
        int need = 0;

        for (int i = 0; i < vegetations.size(); i++) {
            if (vegetations.get(i).checkThirst() == "needs water") {
                need++;
            }
        }
        int eachGet = (waterAmount / need); //how much does one get

        for (int i = 0; i < vegetations.size(); i++) {
            vegetations.get(i).currentWater += (eachGet * vegetations.get(i).absorb);
        }
    }

}