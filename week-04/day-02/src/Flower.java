public class Flower extends Vegetation {

    public Flower(String color) {
        super(color);

    }

    //needs water if its current water amount is less then 5

    public String checkThirst () {
        if (thirst < 5){
            return "needs water";
        } else {
            return "doesnt need water";
        }
    }

}
