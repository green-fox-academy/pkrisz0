package main.java.music;

public class Violin extends StringedInstrument {
    public Violin(int numberOfStrings) {
        super(numberOfStrings);
    }

    public Violin() {
        super(4);
    }

    @Override
    public String sound() {
        return "screeches.";
    }
}
