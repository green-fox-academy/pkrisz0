import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateNumbers {

    List<Integer> digits = new ArrayList<>();

    public  List<Integer> roll() {
        for (int i = 0; i < 4; i++) {
            digits.add(i,(int) (Math.random() * 9) + 1);
        }
        return digits;
    }

    public void reroll(int i) {
        digits.set(i,(int) (Math.random() * 9) + 1);
    }

    public int getCurrent(int i) {
        return digits.get(i);
    }

    public List<Integer> removeCurrent(int i) {
        digits.remove(i);
        return digits;
    }

    public List<Integer> getCurrent() {
        return digits;
    }

    public static void main(String[] args) {
        GenerateNumbers one =  new GenerateNumbers();

        one.roll();
        //int helper = 1;
        for (int i = 0; i < one.removeCurrent(i).size() - 1; i++) {
            while (one.removeCurrent(i).contains(one.getCurrent(i))) {
                one.reroll(i);
            }
            System.out.println(one.getCurrent(i));
        }
    }
}
