package jpmorgan;

import java.util.ArrayList;

public class CreditCardApp extends ArrayList<CreditCard>{
    ArrayList<CreditCard> cards;

    public CreditCardApp() {
        this.cards = new ArrayList<>();
    }

    public void addCards(){
        for (int i = 0; i < 10; i++) {
            this.cards.add(new CreditCard("ABC" + i));
        }
    }
}
