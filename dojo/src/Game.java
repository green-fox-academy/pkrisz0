import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Game {
    Deck deck;
    ArrayList<String> black;
    ArrayList<String> white;

    public Game() {
        deck  = new Deck();
        black = new ArrayList<>(this.hand());
        white = new ArrayList<>(this.hand());
    }

    public static void main(String[] args) {
        Game one = new Game();
        System.out.println(one.welcome());
        System.out.println(one);
        System.out.println(one.play());
    }

    public String welcome(){
        return "hello";
    }

    public ArrayList<String> hand(){
        ArrayList<String> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int cardNo = (int) (Math.random() * (deck.size() - 1));
            hand.add(deck.get(cardNo));
            deck.remove(deck.get(cardNo));
        }
        return hand;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Black: ");
        for (int i = 0; i < 5; i++) {
            sb.append(black.get(i) + " ");
        }
        sb.append(", White: ");
        for (int i = 0; i < 5; i++) {
            sb.append(white.get(i) + " ");
        }
        return sb.toString();
    }

    public HashMap evaluate() {
        HashMap<String,Integer> cardValue = new HashMap<>();
        for (int i = 1; i <= deck.value.size(); i++) {
            cardValue.put(deck.value.get(i - 1),i);
        }
        return cardValue;
    }

    public int getHighest(ArrayList<String> hand){
        ArrayList<Integer>valuesInHand = new ArrayList<>();
        for (int i = 0; i < hand.size(); i++) {
            valuesInHand.add((int) evaluate().get(String.valueOf(hand.get(i).charAt(1))));
        }
        Collections.sort(valuesInHand);

        return valuesInHand.get(valuesInHand.size()-1);
    }

    public String play(){
        if (getHighest(black)> getHighest(white)){
            return "Black wins";
        } else if (getHighest(black)< getHighest(white)) {
            return "White wins";
        }
        return "tie";
    }
}

