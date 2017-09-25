import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;

    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        sharpies.add(sharpie);
    }

    public int countUsable() {
        int useable = 0;
        for (int i = 0; i < sharpies.size(); i++) {
            if

            //sharpie inkamount is > 0
            useable++;
        }
    }




    public static void main(String[] args) {

    }

}
