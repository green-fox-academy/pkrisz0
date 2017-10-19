import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Comparator;

public class ParkingLot extends ArrayList<Car>{

    int size;

    public ParkingLot() {
        this.size = this.size();
    }

    public static void main(String[] args) {
        ParkingLot one = new ParkingLot();
        one.makeCars(256);
        System.out.println(one.allTypes());
        System.out.println(one.allColor());
        System.out.println(one.printFrequent());
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
        ArrayList<String> cars = new ArrayList<>();
        for (int i = 0; i < this.size(); i++) {
            cars.add(this.get(i).color.toString() + " " + this.get(i).type.toString());
        }

        HashMap<Integer, String> mostFrequent = new HashMap<>();
        for (int i = 0; i < cars.size(); i++) {
            int occurrences = Collections.frequency(cars, cars.get(i));
            mostFrequent.put(occurrences, cars.get(i));
        }

        List<Integer> sortedKeys = new ArrayList<>();
        sortedKeys.addAll(mostFrequent.keySet());
        Collections.sort(sortedKeys);
        return "The most frequent car in the lot is the " + mostFrequent.get(sortedKeys.get(sortedKeys.size() - 1)) + ".";
    }

    public Car frequent(){
        HashMap<Integer, Car> mostFrequent = new HashMap<>();
        int frequency = 1;
        for (int i = 0; i < this.size(); i++) {
            for (int j = 0; j < this.size() - 1; j++) {
                if((this.get(i).compareTo(this.get(j))== 1)){
                    frequency++;
                }
            }
            mostFrequent.put(frequency,this.get(i));
            frequency = 1;
        }
        List<Integer> sortedKeys = new ArrayList<>();
        sortedKeys.addAll(mostFrequent.keySet());
        Collections.sort(sortedKeys);
        return mostFrequent.get(sortedKeys.get(sortedKeys.size()-1));
    }

    public String printFrequent(){
        return "The most common car in the lot is the " + frequent().color + " " + frequent().type + ".";
    }
}
