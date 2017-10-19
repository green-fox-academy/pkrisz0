import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck extends ArrayList<String>{
    List<String> suit;
    List<String> value;

    public Deck() {
        value = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"));
        suit = new ArrayList<>(Arrays.asList("C","D", "H", "S"));
        this.generateDeck();
    }

    public ArrayList<String> generateDeck(){
        String dummy = "";

        for (int i = 0; i < suit.size(); i++) {
            for (int j = 0; j < value.size(); j++) {
                dummy = suit.get(i) + value.get(j);
                this.add(dummy);
                dummy = "";
            }
        }
        return this;
    }

}
