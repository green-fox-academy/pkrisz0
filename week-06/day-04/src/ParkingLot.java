import java.util.ArrayList;
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
            allTypes.add(Car.Type.values()[i] + ":" + countType(Car.Type.values()[i]));
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
            allColors.add(Car.Color.values()[i] + ":" + countColor(Car.Color.values()[i]));
        }
        return allColors;
    }

    public String mostFrequent(){
        
    }

}
