public class Card {
    Color color;
    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public enum Color {RED, BLACK}
    public enum Suit {CLUBS, DIAMONDS,HEARTS,SPADES}

    public enum Rank {DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(
                9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

        private int Rankpoints;

        Rank(int points) {
            this.Rankpoints = points;
        }

        public int getRankpoints() {
            return this.Rankpoints;
        }
    }
}



//    The Card class has 3 enum properties:
//        One for the color(red, black)
//        One for the suit(clubs, diamonds, hearts, spades)
//        One for the rank(2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A)