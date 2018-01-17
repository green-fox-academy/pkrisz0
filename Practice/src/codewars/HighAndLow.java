package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighAndLow {
    public static void main(String[] args) {
        System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    public static String HighAndLow(String input) {
        String[] chars = input.split("\\s");
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(chars).forEach(c -> numbers.add(Integer.valueOf(c)));
        Collections.sort(numbers);
        return numbers.get(numbers.size()-1) + " " + numbers.get(0);
    }
}

//    In this little assignment you are given a string of space separated numbers,
// and have to return the highest and lowest number.

