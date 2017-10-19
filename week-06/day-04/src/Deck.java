import java.util.ArrayList;
import java.util.List;

public class Deck extends ArrayList<Card> {
    int size;

    public Deck() {
        this.size = 52;
        this.fillDeck();
    }

    public void fillDeck(){
        for (int i = 0; i < Card.Suit.values().length; i++) {
            for (int j = 0; j < Card.Rank.values().length; j++) {
                this.add(new Card(Card.Suit.values()[i], Card.Rank.values()[j]));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(this.get(i) + " ");
        }
        return sb.toString();
    }
}

