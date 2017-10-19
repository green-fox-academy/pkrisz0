import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public List<String> allTypes(){
        List<String> allTypes = new ArrayList<>();
        for (int i = 0; i < Car.Type.values().length; i++) {
            allTypes.add(Car.Type.values()[i] + ": " + countType(Car.Type.values()[i]));
        }
        return allTypes;
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

    public List<String> allColor(){
        List<String> allColors = new ArrayList<>();
        for (int i = 0; i < Car.Color.values().length; i++) {
            allColors.add(Car.Color.values()[i] + ": " + countColor(Car.Color.values()[i]));
        }
        return allColors;
    }

    public String mostFrequent(){
        String mostFrequent = "The most frequent vehicle in the parking lot is a ";
        List<Integer> countCol = new ArrayList<>();

        for (int i = 0; i < this.allColor().size(); i++) {
           countCol.add(countColor(Car.Color.values()[i]));
        }

        for (int i = 0; i < Car.Color.values().length; i++) {
            if (this.allColor().get(i).contains(String.valueOf(Collections.max(countCol)))){
                mostFrequent += (this.allColor().get(i).replaceAll("[0-9&:]",""));
            }
        }

        List<Integer> countType = new ArrayList<>();

        for (int i = 0; i < this.allTypes().size(); i++) {
            countType.add(countType(Car.Type.values()[i]));
        }

        for (int i = 0; i < Car.Type.values().length; i++) {
            if (this.allTypes().get(i).contains(String.valueOf(Collections.max(countType)))){
                mostFrequent += (this.allTypes().get(i).replaceAll("[0-9&:]",""));
            }
        }
        return mostFrequent + "car.";
    }
}
