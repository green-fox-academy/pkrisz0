public class Card {
    String color;
    String value;
    String name;

    public Card(String color, String value) {
        this.color = color;
        this.value = value;
        this.name = this.value + " " + this.color;
    }
}
