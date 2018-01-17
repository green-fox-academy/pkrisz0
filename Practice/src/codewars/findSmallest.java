package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class findSmallest {

    public static int findSmallestInt(int[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < args.length; i++) {
            numbers.add(args[i]);
        }
        Collections.sort(numbers);
        return numbers.get(0);
    }
}
