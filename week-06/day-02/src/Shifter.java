import java.util.stream.IntStream;

public class Shifter implements CharSequence {

    String string;
    int shift;

    public Shifter(String string, int shift) {
        this.string = string;
        this.shift = shift;
    }

    public static void main(String[] args) {
        Shifter s = new Shifter("example", 2);
        System.out.println(s.charAt(0));
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(index + this.shift);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public IntStream chars() {
        return null;
    }

    @Override
    public IntStream codePoints() {
        return null;
    }
}
