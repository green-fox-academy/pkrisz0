public class Domino implements Comparable<Domino>, Printable {
    private final int[] values;

    public Domino(int valueA, int valueB) {
        this.values = new int[]{valueA, valueB};
    }

    public int[] getValues() {
        return values;
    }

    @Override
    public String toString() {
        return "[" + values[0] + ", " + values[1] + "]";
    }

    @Override
    public int compareTo(Domino d) {
        return Integer.compare(this.getValues()[0],d.getValues()[1]);
    }

    @Override
    public void printAllFields() {
        System.out.print( "[" + values[0] + ", " + values[1] + "]");
    }
}