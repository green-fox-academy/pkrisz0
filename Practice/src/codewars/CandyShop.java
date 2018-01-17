package codewars;

import java.util.ArrayList;

public class CandyShop {

    double income;
    int sugarAmount;
    final static String CANDY = "candy";
    final static String LOLLIPOP = "lollipop";

    ArrayList<Dessert> storage = new ArrayList<>();

    public CandyShop(int gramms) {
        sugarAmount = gramms;
    }

    public void createSweets(String dessert){
        if(dessert.equals("candy")) {
            storage.add(new Candy());
        } else {
            storage.add(new Lollipop());
        }
        sugarAmount -= storage.get(storage.size() - 1).sugar;
    }
    
    public void raise(int percentage) {
        for (Dessert dessert:storage) {
            dessert.raise(percentage);
        }
    }

    public void sell(String dessertType, int amount) {
            for (int i = 0; i < amount; i++) {
                if (getDessert(dessertType) == null) {
                    break;
                }
                storage.remove(getDessert(dessertType));
                income += getDessert(dessertType).price;
            }
    }

    private Dessert getDessert(String dessertType) {

        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")){
                return storage.get(i);
            } else if (storage.get(i) instanceof Candy && dessertType.equals("candy")){
                return storage.get(i);
            }
        }
        return null;
    }

    public void buySugar(int amount){
        sugarAmount += amount;
        income -= 0.1 * amount;
    }

    private int count(String dessertType) {
        int counter = 0;
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i) instanceof Lollipop && dessertType.equals("lollipop")) {
                counter++;
            } else if (storage.get(i) instanceof Candy && dessertType.equals("candy")) {
                counter++;
            }
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Inventory: ");
        sb.append(count("candy"));
        sb.append(" candies, ");
        sb.append(count("lollipop"));
        sb.append(" lollipops,");
        sb.append(" Income: ");
        sb.append(income);
        sb.append("$, Sugar: ");
        sb.append(sugarAmount);
        sb.append("gr");
        return sb.toString();
    }
}
