package main.java.music;

public abstract class StringedInstrument extends Instrument {
    int numberOfStrings;

    public StringedInstrument(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public abstract String sound();

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + ", a " + this.numberOfStrings + "-stringed instrument that " + this.sound());
    }
}
