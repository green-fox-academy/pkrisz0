package main.java.music;

public class ElectricGuitar extends StringedInstrument {
    public ElectricGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    public ElectricGuitar() {
        super(6);
    }

    @Override
    public String sound() {
        return "twangs.";
    }
}
