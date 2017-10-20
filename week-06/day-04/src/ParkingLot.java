import java.util.*;

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
        one.frequentCar();
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

    public void frequentCar(){
        HashMap<String, Integer> mostFrequent = new HashMap<>();
        for (int i = 0; i < this.size(); i++) {
            if (!mostFrequent.containsKey(this.get(i).name)){
                mostFrequent.put(this.get(i).name, aaaargh(i));
            }
        }

        System.out.println("The most frequent car is");

        int maxValueInMap=(Collections.max(mostFrequent.values()));  // This will return max value in the Hashmap
        mostFrequent.forEach((key, value) -> {  // Itrate through hashmap
            if (value == maxValueInMap) {
                System.out.println(key);     // Print the key with max value
            }
        });


    }


    public int aaaargh(int i){
        return Collections.frequency(this, this.get(i));
    }


}
