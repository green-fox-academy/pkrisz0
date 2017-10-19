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
}

