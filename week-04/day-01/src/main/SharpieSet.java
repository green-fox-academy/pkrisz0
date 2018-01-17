package main.java;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;
    String name;

    public SharpieSet(String name) {
        this.sharpies = new ArrayList<>();
        this.name = name;
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public int countUseable() {
        int ok = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount > 0) {
                ok++;
            }
        } return ok;
    }

    public void removeTrash() {
        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0) {
                sharpies.remove(sharpies.get(i));
            }
        }
    }

    public static void main(String[] args) {
        SharpieSet one  = new SharpieSet("Uno");

        Sharpie blue = new Sharpie("blue", 4.8f);
        Sharpie red = new Sharpie("red", 6.7f);
        one.add(blue);
        one.add(red);

        //lets make one empty by using it 50 times
        for (int i = 0; i < 50; i++) {
            red.use();
        }

        System.out.println("Remaining useful sharpies: " + one.countUseable());
        one.removeTrash();
    }
}

// countUsable() -> sharpie is usable if it has ink in it
// removeTrash() -> removes all unusable sharpies

