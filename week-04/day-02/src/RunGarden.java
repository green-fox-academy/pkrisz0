public class RunGarden {
    public static void main(String[] args) {

        Vegetation garden = new Vegetation("Garden");

        Flower blue = new Flower("blue");
        Flower yellow = new Flower("yellow");
        Tree purple = new Tree("purple");
        Tree orange = new Tree("orange");

        garden.addVeg(blue);
        garden.addVeg(yellow);
        garden.addVeg(purple);
        garden.addVeg(orange);

        garden.display();
        garden.water(40);
        garden.display();
        garden.water(80);
        garden.display();
    }
}

/*
The program should demonstrate an example garden with two flowers (yellow and blue) and two trees (purple and orange).
In the example after creating them you should show the user, how the garden looks like.
 */

