import java.util.Random;

public class Car {
    Color color;
    Type type;
    String name;

    @Override
    public boolean equals(Object car) {
        if (this.type == ((Car) car).type && this.color == ((Car) car).color){
            return true;
        }
        return false;
    }

    public enum Color{RED, GREEN, BLUE, BLACK}
    public enum Type{ELECTRIC, HYBRID}

    public Car() {
        this.color = getRandomColor();
        this.type = getRandomType();
        this.name = String.valueOf(this.color) + " " +String.valueOf(this.type);
    }

    public static Type getRandomType()  {
        return Type.values()[new Random().nextInt(Type.values().length)];
    }

    public static Color getRandomColor()  {
        return Color.values()[new Random().nextInt(Color.values().length)];
    }
}

