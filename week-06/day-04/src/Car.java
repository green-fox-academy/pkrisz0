import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Car {
    Color color;
    Type type;

    public enum Color{RED, GREEN, BLUE, BLACK};
    public enum Type{ELECTRIC, HYBRID}

    public Car() {
        this.color = getRandomColor();
        this.type = getRandomType();
    }

    public static Type getRandomType()  {
        return Type.values()[new Random().nextInt(Type.values().length)];
    }

    public static Color getRandomColor()  {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }


    public static void main(String[] args) {
        Car meh = new Car();
        meh.makeCars(256);
        System.out.println(meh.allTypes());

    }

    public ArrayList<Car> makeCars(int howMany){
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < howMany; i++) {
            cars.add(new Car());
        }
        return cars;
    }

    public int countType(ArrayList<Car> list, Type type){
        int count = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).type == type ){
                count++;
            }
        }
        return count;
    }

    public List<String> allTypes(){
        List<String> allTypes = new ArrayList<>();
        for (int i = 0; i < Type.values().length; i++) {
            allTypes.add(Type.values()[i] + ":" + countType(makeCars(256),Type.values()[i]));
        }
        return allTypes;
    }

}


//    Create a Car class with 2 enum properties
//enum of car types
//        The types of these cars or vehicles is up to you
//enum of colors
//        Create 256 Vehicles randomly and put them into a List
//        Count and Print the number of same vehicles for each type
//        Count and Print the number of same vehicles for each color
//        Print the most frequently occurring vehicle
