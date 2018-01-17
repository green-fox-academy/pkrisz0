import java.util.Arrays;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(pallindromeCheck("kek"));
        System.out.println(pallindromeCheck("nemmozi"));
    }

    public static boolean pallindromeCheck(String input){
        String reversed = Arrays.asList(input)
                .stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList()).get(0);
    return reversed.equals(input);
    }
}

//    Create a function that determines if a string is a palindrome
