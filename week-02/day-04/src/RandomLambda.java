import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RandomLambda {

    public static void main(String[] args) {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));

        input.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));

        List<Integer> output = input.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        int x = (int) input.stream().filter(i -> i > 6).count();

        System.out.println(output);
        System.out.println(x);
    }
}
