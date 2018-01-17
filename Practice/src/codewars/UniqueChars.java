package codewars;

import java.util.ArrayList;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(uniqueCharacters("anagram"));
    }

    public static ArrayList<String> uniqueCharacters(String input){
        ArrayList<String> uniques = new ArrayList<>();
        ArrayList<String> notUniques = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            String letter = String.valueOf(input.charAt(i));
            if (!uniques.contains(letter) && !notUniques.contains(letter)) {
                uniques.add(letter);
            } else {
                uniques.remove(letter);
                notUniques.add(letter);
            }
        }
        return uniques;
    }
}

// Create a function called `uniqueCharacters` that takes a string as parameter
// and returns a list with the unique letters of the given string
// Create basic unit tests for it with at least 3 different test cases
// Should print out:
// ["n", "g", "r", "m"]

