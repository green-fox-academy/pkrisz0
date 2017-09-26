import java.util.ArrayList;

public class Vegetation {
    String name;
    int thirst;
    ArrayList<Vegetation> vegetations;
    int waterAmount;

    //constructor
    public Vegetation(String name) {
        this.name = name;
        thirst = 0;
        this.vegetations = new ArrayList<Vegetation>();
        waterAmount = 40;
    }

    //add Trees / Flowers
    public void addVeg(Vegetation vegetation) {
        vegetations.add(vegetation);
    }

    //check thirst
    public String checkThirst() {
        if (thirst < 5) {
            return "needs water";
        } else {
            return "doesnt need water";
        }
    }


    //actual watering
    public void giveWater() {
        // thirst + water();
    }


    public void display() {

        for (int i = 0; i < vegetations.size(); i++) {
            System.out.println("The " + name + " Flower / Tree " + vegetations.get(i).checkThirst());
        }
    }

    public int water() {
        //how many need watering
        int need = 0;
        int eachGet;

        for (int i = 0; i < vegetations.size(); i++) {
            if (vegetations.get(i).checkThirst() == "needs water") {
                need++;
            }
        }
        //returns the amount each get based on thirsty vegetation
        return eachGet = waterAmount / need;
    }
}