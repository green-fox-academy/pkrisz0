package main.java.music;

public class BassGuitar extends StringedInstrument {
    public BassGuitar(int numberOfStrings) {
        super(numberOfStrings);
    }

    public BassGuitar() {
        super( 4);
    }

    @Override
    public String sound() {
        return "goes Duum-duum-duum.";
    }
}
