package codewars;

public class Dessert {
    double price;
    int sugar;

    public Dessert(double price, int sugar) {
        this.price = price;
        this.sugar = sugar;
    }

    public void raise(int percentage){
        price += price * (percentage / 100);
    }
}
