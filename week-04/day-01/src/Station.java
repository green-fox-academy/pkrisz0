public class Station {
    int gasAmount;


    public void refill(Car limo) {
        this.gasAmount -= limo.capacity;
        limo.gasAmount += 100;
    }

    public static void main(String[] args) {
        
    }
}
