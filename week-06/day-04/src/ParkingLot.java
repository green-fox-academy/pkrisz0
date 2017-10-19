import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ParkingLot extends ArrayList<Car> {

    int size;

    public ParkingLot() {
        this.size = this.size();
    }

    public static void main(String[] args) {
        ParkingLot one = new ParkingLot();
        one.makeCars(256);
        System.out.println(one.allTypes());
        System.out.println(one.allColor());
        System.out.println(one.mostFrequent());
    }

    public void makeCars(int howMany){
        for (int i = 0; i < howMany; i++) {
            add(new Car());
        }
    }

    public int countType(Car.Type type){
        int count = 0;
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).type == type ){
                count++;
            }
        }
        return count;
    }

    public HashMap<Car.Type, Integer> allTypes(){
        HashMap<Car.Type, Integer> types = new HashMap<>();
        for (int i = 0; i < Car.Type.values().length; i++) {
            types.put(Car.Type.values()[i] , countType(Car.Type.values()[i]));
        }
        return types;
    }

    public int countColor(Car.Color color){
        int count = 0;

        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).color == color ){
                count++;
            }
        }
        return count;
    }

    public HashMap<Car.Color, Integer> allColor(){
        HashMap<Car.Color, Integer> colors = new HashMap<>();
        for (int i = 0; i < Car.Color.values().length; i++) {
            colors.put(Car.Color.values()[i] , countColor(Car.Color.values()[i]));
        }
        return colors;
    }

    public String mostFrequent(){
        String mostFrequent = "The most frequent vehicle in the parking lot is a ";

        for (Car.Color x : allColor().keySet()) {
            if (allColor().get(x).equals(Collections.max(allColor().values()))){
                mostFrequent += x + " ";
            }
        }

        for (Car.Type x : allTypes().keySet()) {
            if (allTypes().get(x).equals(Collections.max(allTypes().values()))){
                mostFrequent += x + " car.";
            }
        }
        return mostFrequent;
    }
}
