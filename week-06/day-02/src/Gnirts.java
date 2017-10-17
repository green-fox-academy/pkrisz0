import java.util.stream.IntStream;

public class Gnirts implements CharSequence {
    String string;

    public Gnirts(String string) {
        this.string = string;
    }

    public static void main(String[] args) {
        Gnirts g = new Gnirts("example");
        System.out.println(g.charAt(1));
    }

    @Override
    public int length() {
        return string.length();
    }

    @Override
    public char charAt(int index) {
        return this.string.charAt(string.length() - 1 - index);
    }


    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public String toString() {
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
