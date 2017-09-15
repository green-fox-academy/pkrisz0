import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        anagram("dog", "god");
    }

    private static void anagram(String inputone, String inputtwo) {


        String reversed = "";

        for(int i = inputone.length() - 1; i >= 0 ; i--){
            char dummy = inputone.charAt(i);
            reversed = reversed.concat(String.valueOf(dummy));
        }
        System.out.println(reversed.equals(inputtwo));


    }

}
