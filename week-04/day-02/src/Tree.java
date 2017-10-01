public class Tree extends Vegetation{

    public Tree(String color) {
        super(color);
        absorb = 0.4;
    }

    // needs water if its current water amount is less then 10

    public String checkThirst () {
        if (currentWater < 10){
            return "needs water";
        } else {
            return "doesnt need water";
        }
    }
}

