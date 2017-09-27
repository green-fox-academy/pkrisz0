import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    ArrayList<Integer> numbers;


    public Sum() {
        this.numbers = new ArrayList<>();
    }

    public int sumMethod(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        } return sum;
    }
}

