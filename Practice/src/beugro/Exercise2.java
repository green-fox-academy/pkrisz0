import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(reverser("izom"));
    }

    public static String reverser(String input){
        return Arrays.asList(input)
                .stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList()).get(0);
    }
}

//    Create a function that reverses a string
